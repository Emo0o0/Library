package com.example.adastra.core.services.book;

import com.example.adastra.api.inputoutput.book.getall.BookGetAllListOperationOutput;
import com.example.adastra.api.inputoutput.book.getall.BookGetAllOperation;
import com.example.adastra.api.inputoutput.book.getall.BookGetAllOperationInput;
import com.example.adastra.api.inputoutput.book.getall.BookGetAllOperationOutput;
import com.example.adastra.persistence.entities.Author;
import com.example.adastra.persistence.entities.Book;
import com.example.adastra.persistence.entities.BookGenres;
import com.example.adastra.persistence.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookGetAllOperationProcessor implements BookGetAllOperation {

    private final BookRepository bookRepository;

    @Override
    public BookGetAllListOperationOutput process(BookGetAllOperationInput input) {

        PageRequest pageRequest = PageRequest.of(input.getPageNumber() - 1, input.getItemsPerPage());

        List<Book> books = bookRepository.findAll(pageRequest).getContent();

        return BookGetAllListOperationOutput.builder()
                .books(books.stream()
                        .map(book -> BookGetAllOperationOutput.builder()
                                .id(book.getBookId().toString())
                                .isbn(book.getIsbn())
                                .title(book.getTitle())
                                .authors(book.getAuthors().stream().map(Author::getName).toList())
                                .genres(book.getGenre().stream()
                                        .map(BookGenres::toString)
                                        .collect(Collectors.toList()))
                                .build())
                        .collect(Collectors.toList()))
                .build();
    }
}
