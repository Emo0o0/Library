package com.example.adastra.core.services.bookcopy;

import com.example.adastra.api.inputoutput.bookcopy.getavailable.BookCopyGetAvailableListOperationOutput;
import com.example.adastra.api.inputoutput.bookcopy.getavailable.BookCopyGetAvailableOperation;
import com.example.adastra.api.inputoutput.bookcopy.getavailable.BookCopyGetAvailableOperationInput;
import com.example.adastra.api.inputoutput.bookcopy.getavailable.BookCopyGetAvailableOperationOutput;
import com.example.adastra.core.exceptions.book.BookIdNotFoundException;
import com.example.adastra.persistence.entities.Book;
import com.example.adastra.persistence.repositories.BookCopyRepository;
import com.example.adastra.persistence.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookCopyGetAvailableOperationProcessor implements BookCopyGetAvailableOperation {

    private final BookRepository bookRepository;
    private final BookCopyRepository bookCopyRepository;

    @Override
    public BookCopyGetAvailableListOperationOutput process(BookCopyGetAvailableOperationInput input) {

        Book book = bookRepository.findById(UUID.fromString(input.getBookId()))
                .orElseThrow(() -> new BookIdNotFoundException("Book with id [" + input.getBookId() + "] was not found"));

        return BookCopyGetAvailableListOperationOutput.builder()
                .books(bookCopyRepository.findByBookAndAvailable(book, true).stream()
                        .map(copy -> BookCopyGetAvailableOperationOutput.builder()
                                .id(copy.getBookCopyId().toString())
                                .condition(copy.getCondition().toString())
                                .location(copy.getLocation())
                                .build())
                        .collect(Collectors.toList()))
                .build();

    }
}
