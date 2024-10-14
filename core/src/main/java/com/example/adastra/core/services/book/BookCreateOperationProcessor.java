package com.example.adastra.core.services.book;

import com.example.adastra.api.inputoutput.book.create.BookCreateOperation;
import com.example.adastra.api.inputoutput.book.create.BookCreateOperationInput;
import com.example.adastra.api.inputoutput.book.create.BookCreateOperationOutput;
import com.example.adastra.core.exceptions.author.AuthorIdNotFoundException;
import com.example.adastra.persistence.entities.Author;
import com.example.adastra.persistence.entities.Book;
import com.example.adastra.persistence.repositories.AuthorRepository;
import com.example.adastra.persistence.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookCreateOperationProcessor implements BookCreateOperation {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    @Override
    public BookCreateOperationOutput process(BookCreateOperationInput input) {

        List<Author> authors = authorRepository.findByAuthorIdIn(input.getAuthors().stream()
                .map(UUID::fromString)
                .collect(Collectors.toList()));

        if (!(input.getAuthors().size() == authors.size())) {
            throw new AuthorIdNotFoundException("An author ID was not found");
        }

        Book book = Book.builder()
                .title(input.getTitle())
                .isbn(input.getIsbn())
                .authors(authors)
                .genre(input.getGenres())
                .build();

        bookRepository.save(book);

        return BookCreateOperationOutput.builder()
                .id(book.getBookId().toString())
                .build();

    }
}
