package com.example.adastra.core.services.book;

import com.example.adastra.api.inputoutput.book.getbyauthor.BookGetByAuthorListOperationOutput;
import com.example.adastra.api.inputoutput.book.getbyauthor.BookGetByAuthorOperation;
import com.example.adastra.api.inputoutput.book.getbyauthor.BookGetByAuthorOperationInput;
import com.example.adastra.api.inputoutput.book.getbyauthor.BookGetByAuthorOperationOutput;
import com.example.adastra.core.exceptions.author.AuthorNameNotFoundException;
import com.example.adastra.persistence.entities.Author;
import com.example.adastra.persistence.entities.BookGenres;
import com.example.adastra.persistence.repositories.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookGetByAuthorOperationProcessor implements BookGetByAuthorOperation {

    private final AuthorRepository authorRepository;

    @Override
    public BookGetByAuthorListOperationOutput process(BookGetByAuthorOperationInput input) {

        Author author = authorRepository.findByName(input.getName())
                .orElseThrow(() -> new AuthorNameNotFoundException("Author with name [" + input.getName() + "] was not found"));

        return BookGetByAuthorListOperationOutput.builder()
                .books(author.getBooks().stream()
                        .map(book -> BookGetByAuthorOperationOutput.builder()
                                .id(book.getBookId().toString())
                                .isbn(book.getIsbn())
                                .title(book.getTitle())
                                .authors(book.getAuthors().stream().map(Author::getName).collect(Collectors.toList()))
                                .genres(book.getGenre().stream().map(BookGenres::toString).collect(Collectors.toList()))
                                .build())
                        .collect(Collectors.toList()))
                .build();
    }
}
