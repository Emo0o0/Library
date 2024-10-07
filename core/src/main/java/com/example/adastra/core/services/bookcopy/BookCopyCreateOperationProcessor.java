package com.example.adastra.core.services.bookcopy;

import com.example.adastra.api.inputoutput.bookcopy.create.BookCopyCreateOperation;
import com.example.adastra.api.inputoutput.bookcopy.create.BookCopyCreateOperationInput;
import com.example.adastra.api.inputoutput.bookcopy.create.BookCopyCreateOperationOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookCopyCreateOperationProcessor implements BookCopyCreateOperation {
    @Override
    public BookCopyCreateOperationOutput process(BookCopyCreateOperationInput input) {
        return null;
    }
}
