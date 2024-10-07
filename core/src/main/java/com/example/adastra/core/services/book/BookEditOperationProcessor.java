package com.example.adastra.core.services.book;

import com.example.adastra.api.inputoutput.book.edit.BookEditOperation;
import com.example.adastra.api.inputoutput.book.edit.BookEditOperationInput;
import com.example.adastra.api.inputoutput.book.edit.BookEditOperationOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookEditOperationProcessor implements BookEditOperation {
    @Override
    public BookEditOperationOutput process(BookEditOperationInput input) {
        return null;
    }
}
