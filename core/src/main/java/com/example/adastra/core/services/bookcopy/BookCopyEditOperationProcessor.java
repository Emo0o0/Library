package com.example.adastra.core.services.bookcopy;

import com.example.adastra.api.inputoutput.bookcopy.edit.BookCopyEditOperation;
import com.example.adastra.api.inputoutput.bookcopy.edit.BookCopyEditOperationInput;
import com.example.adastra.api.inputoutput.bookcopy.edit.BookCopyEditOperationOutput;
import com.example.adastra.core.exceptions.bookcopy.BookCopyIdNotFoundException;
import com.example.adastra.persistence.entities.BookCopy;
import com.example.adastra.persistence.entities.BookCopyCondition;
import com.example.adastra.persistence.repositories.BookCopyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BookCopyEditOperationProcessor implements BookCopyEditOperation {

    private final BookCopyRepository bookCopyRepository;

    @Override
    public BookCopyEditOperationOutput process(BookCopyEditOperationInput input) {

        BookCopy bookCopy = bookCopyRepository.findById(UUID.fromString(input.getId()))
                .orElseThrow(() -> new BookCopyIdNotFoundException("Book copy with id [" + input.getId() + "] was not found"));

        editBookCopy(input, bookCopy);

        bookCopyRepository.save(bookCopy);

        return BookCopyEditOperationOutput.builder()
                .success(true)
                .build();
    }

    private void editBookCopy(BookCopyEditOperationInput input, BookCopy bookCopy) {
        if (!input.getLocation().isBlank())
            bookCopy.setLocation(input.getLocation());

        if (!input.getCondition().isBlank())
            bookCopy.setCondition(BookCopyCondition.valueOf(input.getCondition()));

        if (!input.getIsAvailable().isBlank())
            bookCopy.setAvailable(Boolean.parseBoolean(input.getIsAvailable()));
    }
}
