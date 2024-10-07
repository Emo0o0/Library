package com.example.adastra.core.services.author;

import com.example.adastra.api.inputoutput.author.create.AuthorCreateOperation;
import com.example.adastra.api.inputoutput.author.create.AuthorCreateOperationInput;
import com.example.adastra.api.inputoutput.author.create.AuthorCreateOperationOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorCreateOperationProcessor implements AuthorCreateOperation {
    @Override
    public AuthorCreateOperationOutput process(AuthorCreateOperationInput input) {
        return null;
    }
}
