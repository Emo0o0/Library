package com.example.adastra.core.services.bookcopy;

import com.example.adastra.api.inputoutput.bookcopy.getbyid.BookCopyGetByIdOperation;
import com.example.adastra.api.inputoutput.bookcopy.getbyid.BookCopyGetByIdOperationInput;
import com.example.adastra.api.inputoutput.bookcopy.getbyid.BookCopyGetByIdOperationOutput;
import com.example.adastra.core.exceptions.bookcopy.BookCopyIdNotFoundException;
import com.example.adastra.persistence.entities.BookCopy;
import com.example.adastra.persistence.repositories.BookCopyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BookCopyGetByIdOperationProcessor implements BookCopyGetByIdOperation {

    private final BookCopyRepository bookCopyRepository;

    @Override
    public BookCopyGetByIdOperationOutput process(BookCopyGetByIdOperationInput input) {

        BookCopy bookCopy = bookCopyRepository.findById(UUID.fromString(input.getId()))
                .orElseThrow(() -> new BookCopyIdNotFoundException("Book copy with id [" + input.getId() + "] was not found"));

        return BookCopyGetByIdOperationOutput.builder()
                .id(bookCopy.getBookCopyId().toString())
                .book(bookCopy.getBook())
                .condition(bookCopy.getCondition().toString())
                .location(bookCopy.getLocation())
                .isAvailable(bookCopy.isAvailable())
                .build();
    }
}
