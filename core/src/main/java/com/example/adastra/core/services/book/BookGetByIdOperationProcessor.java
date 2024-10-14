package com.example.adastra.core.services.book;

import com.example.adastra.api.inputoutput.book.getbyid.BookGetByIdOperation;
import com.example.adastra.api.inputoutput.book.getbyid.BookGetByIdOperationInput;
import com.example.adastra.api.inputoutput.book.getbyid.BookGetByIdOperationOutput;
import com.example.adastra.core.exceptions.book.BookIdNotFoundException;
import com.example.adastra.persistence.entities.Author;
import com.example.adastra.persistence.entities.Book;
import com.example.adastra.persistence.entities.BookGenres;
import com.example.adastra.persistence.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookGetByIdOperationProcessor implements BookGetByIdOperation {

    private final BookRepository bookRepository;

    @Override
    public BookGetByIdOperationOutput process(BookGetByIdOperationInput input) {

        Book book = bookRepository.findById(UUID.fromString(input.getId()))
                .orElseThrow(() -> new BookIdNotFoundException("Book with id [" + input.getId() + "] was not found"));

        return BookGetByIdOperationOutput.builder()
                .id(book.getBookId().toString())
                .isbn(book.getIsbn())
                .title(book.getTitle())
                .authors(book.getAuthors().stream().map(Author::getName).collect(Collectors.toList()))
                .genres(book.getGenre().stream().map(BookGenres::toString).collect(Collectors.toList()))
                .build();
    }
}
