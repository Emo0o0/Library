package com.example.adastra.core.services.author;

import com.example.adastra.api.inputoutput.author.getall.AuthorGetAllListOperationOutput;
import com.example.adastra.api.inputoutput.author.getall.AuthorGetAllOperation;
import com.example.adastra.api.inputoutput.author.getall.AuthorGetAllOperationInput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorGetAllOperationProcessor implements AuthorGetAllOperation {
    @Override
    public AuthorGetAllListOperationOutput process(AuthorGetAllOperationInput input) {
        return null;
    }
}
