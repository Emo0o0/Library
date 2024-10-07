package com.example.adastra.core.services.bookcopy;

import com.example.adastra.api.inputoutput.bookcopy.getbyid.BookCopyGetByIdOperation;
import com.example.adastra.api.inputoutput.bookcopy.getbyid.BookCopyGetByIdOperationInput;
import com.example.adastra.api.inputoutput.bookcopy.getbyid.BookCopyGetByIdOperationOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookCopyGetByIdOperationProcessor implements BookCopyGetByIdOperation {
    @Override
    public BookCopyGetByIdOperationOutput process(BookCopyGetByIdOperationInput input) {
        return null;
    }
}
