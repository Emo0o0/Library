package com.example.adastra.core.services.book;

import com.example.adastra.api.inputoutput.book.search.BookSearchOperation;
import com.example.adastra.api.inputoutput.book.search.BookSearchOperationInput;
import com.example.adastra.api.inputoutput.book.search.BookSearchOperationOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookSearchOperationProcessor implements BookSearchOperation {
    @Override
    public BookSearchOperationOutput process(BookSearchOperationInput input) {
        return null;
    }
}
