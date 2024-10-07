package com.example.adastra.core.services.author;

import com.example.adastra.api.inputoutput.author.delete.AuthorDeleteOperation;
import com.example.adastra.api.inputoutput.author.delete.AuthorDeleteOperationInput;
import com.example.adastra.api.inputoutput.author.delete.AuthorDeleteOperationOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorDeleteOperationProcessor implements AuthorDeleteOperation {
    @Override
    public AuthorDeleteOperationOutput process(AuthorDeleteOperationInput input) {
        return null;
    }
}
