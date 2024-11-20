package com.example.adastra.core.services.bookcopy;

import com.example.adastra.api.inputoutput.bookcopy.create.BookCopyCreateOperation;
import com.example.adastra.api.inputoutput.bookcopy.create.BookCopyCreateOperationInput;
import com.example.adastra.api.inputoutput.bookcopy.create.BookCopyCreateOperationOutput;
import com.example.adastra.core.exceptions.book.BookIdNotFoundException;
import com.example.adastra.persistence.entities.Book;
import com.example.adastra.persistence.entities.BookCopy;
import com.example.adastra.persistence.entities.BookCopyCondition;
import com.example.adastra.persistence.repositories.BookCopyRepository;
import com.example.adastra.persistence.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BookCopyCreateOperationProcessor implements BookCopyCreateOperation {

    private final BookRepository bookRepository;
    private final BookCopyRepository bookCopyRepository;

    @Override
    public BookCopyCreateOperationOutput process(BookCopyCreateOperationInput input) {

        Book book = bookRepository.findById(UUID.fromString(input.getBookId()))
                .orElseThrow(() -> new BookIdNotFoundException("Book with id [" + input.getBookId() + "] was not found"));

        BookCopy bookCopy = BookCopy.builder()
                .book(book)
                .condition(BookCopyCondition.valueOf(input.getBookCopyCondition()))
                .location(input.getLocation())
                .available(input.isAvailable())
                .build();

        bookCopyRepository.save(bookCopy);

        return BookCopyCreateOperationOutput.builder()
                .id(bookCopy.getBookCopyId().toString())
                .build();
    }
}
