package com.example.adastra.core.services.bookcopy;

import com.example.adastra.api.inputoutput.bookcopy.getavailable.BookCopyGetAvailableListOperationOutput;
import com.example.adastra.api.inputoutput.bookcopy.getavailable.BookCopyGetAvailableOperation;
import com.example.adastra.api.inputoutput.bookcopy.getavailable.BookCopyGetAvailableOperationInput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookCopyGetAvailableOperationProcessor implements BookCopyGetAvailableOperation {
    @Override
    public BookCopyGetAvailableListOperationOutput process(BookCopyGetAvailableOperationInput input) {
        return null;
    }
}
