package com.example.adastra.core.services.book;

import com.example.adastra.api.inputoutput.book.getall.BookGetAllListOperationOutput;
import com.example.adastra.api.inputoutput.book.getall.BookGetAllOperation;
import com.example.adastra.api.inputoutput.book.getall.BookGetAllOperationInput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookGetAllOperationProcessor implements BookGetAllOperation {
    @Override
    public BookGetAllListOperationOutput process(BookGetAllOperationInput input) {
        return null;
    }
}
