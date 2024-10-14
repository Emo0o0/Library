package com.example.adastra.core.services.book;

import com.example.adastra.api.inputoutput.book.edit.BookEditOperation;
import com.example.adastra.api.inputoutput.book.edit.BookEditOperationInput;
import com.example.adastra.api.inputoutput.book.edit.BookEditOperationOutput;
import com.example.adastra.core.exceptions.book.BookIdNotFoundException;
import com.example.adastra.persistence.entities.Book;
import com.example.adastra.persistence.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BookEditOperationProcessor implements BookEditOperation {

    private final BookRepository bookRepository;

    @Override
    public BookEditOperationOutput process(BookEditOperationInput input) {

        Book book = bookRepository.findById(UUID.fromString(input.getId()))
                .orElseThrow(() -> new BookIdNotFoundException("Book with id [" + input.getId() + "] was not found"));

        if (!input.getTitle().isBlank())
            book.setTitle(input.getTitle());

        bookRepository.save(book);

        return BookEditOperationOutput.builder()
                .success(true)
                .build();
    }
}
