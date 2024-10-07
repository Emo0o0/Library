package com.example.adastra.core.services.book;

import com.example.adastra.api.inputoutput.book.getbyauthor.BookGetByAuthorListOperationOutput;
import com.example.adastra.api.inputoutput.book.getbyauthor.BookGetByAuthorOperation;
import com.example.adastra.api.inputoutput.book.getbyauthor.BookGetByAuthorOperationInput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookGetByAuthorOperationProcessor implements BookGetByAuthorOperation {
    @Override
    public BookGetByAuthorListOperationOutput process(BookGetByAuthorOperationInput input) {
        return null;
    }
}
