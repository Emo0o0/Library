package com.example.adastra.core.services.book;

import com.example.adastra.api.inputoutput.book.getbyid.BookGetByIdOperation;
import com.example.adastra.api.inputoutput.book.getbyid.BookGetByIdOperationInput;
import com.example.adastra.api.inputoutput.book.getbyid.BookGetByIdOperationOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookGetByIdOperationProcessor implements BookGetByIdOperation {
    @Override
    public BookGetByIdOperationOutput process(BookGetByIdOperationInput input) {
        return null;
    }
}
