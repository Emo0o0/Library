package com.example.adastra.core.services.book;

import com.example.adastra.api.inputoutput.book.delete.BookDeleteOperation;
import com.example.adastra.api.inputoutput.book.delete.BookDeleteOperationInput;
import com.example.adastra.api.inputoutput.book.delete.BookDeleteOperationOutput;
import com.example.adastra.core.exceptions.book.BookHasExistingCopiesException;
import com.example.adastra.core.exceptions.book.BookIdNotFoundException;
import com.example.adastra.persistence.entities.Book;
import com.example.adastra.persistence.repositories.BookCopyRepository;
import com.example.adastra.persistence.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BookDeleteOperationProcessor implements BookDeleteOperation {

    private final BookRepository bookRepository;
    private final BookCopyRepository bookCopyRepository;

    @Override
    public BookDeleteOperationOutput process(BookDeleteOperationInput input) {

        Book book = bookRepository.findById(UUID.fromString(input.getId()))
                .orElseThrow(() -> new BookIdNotFoundException("Book with id [" + input.getId() + "] was not found"));

        if (!bookCopyRepository.existsByBook(book))
            throw new BookHasExistingCopiesException("This book has existing copies. Cannot delete it");

        bookRepository.delete(book);

        return BookDeleteOperationOutput.builder()
                .success(true)
                .build();
    }
}
