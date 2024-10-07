package com.example.adastra.core.services.author;

import com.example.adastra.api.inputoutput.author.edit.AuthorEditOperation;
import com.example.adastra.api.inputoutput.author.edit.AuthorEditOperationInput;
import com.example.adastra.api.inputoutput.author.edit.AuthorEditOperationOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorEditOperationProcessor implements AuthorEditOperation {
    @Override
    public AuthorEditOperationOutput process(AuthorEditOperationInput input) {
        return null;
    }
}
