package com.example.adastra.core.services.bookcopy;

import com.example.adastra.api.inputoutput.bookcopy.delete.BookCopyDeleteOperation;
import com.example.adastra.api.inputoutput.bookcopy.delete.BookCopyDeleteOperationInput;
import com.example.adastra.api.inputoutput.bookcopy.delete.BookCopyDeleteOperationOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookCopyDeleteOperationProcessor implements BookCopyDeleteOperation {
    @Override
    public BookCopyDeleteOperationOutput process(BookCopyDeleteOperationInput input) {
        return null;
    }
}
