package com.example.adastra.core.services.book;

import com.example.adastra.api.inputoutput.book.create.BookCreateOperation;
import com.example.adastra.api.inputoutput.book.create.BookCreateOperationInput;
import com.example.adastra.api.inputoutput.book.create.BookCreateOperationOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookCreateOperationProcessor implements BookCreateOperation {
    @Override
    public BookCreateOperationOutput process(BookCreateOperationInput input) {
        return null;
    }
}
