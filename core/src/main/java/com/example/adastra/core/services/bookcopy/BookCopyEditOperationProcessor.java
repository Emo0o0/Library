package com.example.adastra.core.services.bookcopy;

import com.example.adastra.api.inputoutput.bookcopy.edit.BookCopyEditOperation;
import com.example.adastra.api.inputoutput.bookcopy.edit.BookCopyEditOperationInput;
import com.example.adastra.api.inputoutput.bookcopy.edit.BookCopyEditOperationOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookCopyEditOperationProcessor implements BookCopyEditOperation {
    @Override
    public BookCopyEditOperationOutput process(BookCopyEditOperationInput input) {
        return null;
    }
}
