package com.example.adastra.core.services.book;

import com.example.adastra.api.inputoutput.book.delete.BookDeleteOperation;
import com.example.adastra.api.inputoutput.book.delete.BookDeleteOperationInput;
import com.example.adastra.api.inputoutput.book.delete.BookDeleteOperationOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookDeleteOperationProcessor implements BookDeleteOperation {
    @Override
    public BookDeleteOperationOutput process(BookDeleteOperationInput input) {
        return null;
    }
}
