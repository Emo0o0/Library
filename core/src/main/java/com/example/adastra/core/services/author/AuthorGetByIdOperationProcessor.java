package com.example.adastra.core.services.author;

import com.example.adastra.api.inputoutput.author.getbyid.AuthorGetByIdOperation;
import com.example.adastra.api.inputoutput.author.getbyid.AuthorGetByIdOperationInput;
import com.example.adastra.api.inputoutput.author.getbyid.AuthorGetByIdOperationOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorGetByIdOperationProcessor implements AuthorGetByIdOperation {
    @Override
    public AuthorGetByIdOperationOutput process(AuthorGetByIdOperationInput input) {
        return null;
    }
}
