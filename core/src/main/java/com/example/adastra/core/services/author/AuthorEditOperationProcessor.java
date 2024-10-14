package com.example.adastra.core.services.author;

import com.example.adastra.api.inputoutput.author.edit.AuthorEditOperation;
import com.example.adastra.api.inputoutput.author.edit.AuthorEditOperationInput;
import com.example.adastra.api.inputoutput.author.edit.AuthorEditOperationOutput;
import com.example.adastra.core.exceptions.author.AuthorIdNotFoundException;
import com.example.adastra.persistence.entities.Author;
import com.example.adastra.persistence.repositories.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AuthorEditOperationProcessor implements AuthorEditOperation {

    private final AuthorRepository authorRepository;

    @Override
    public AuthorEditOperationOutput process(AuthorEditOperationInput input) {

        Author author = authorRepository.findById(UUID.fromString(input.getId()))
                .orElseThrow(() -> new AuthorIdNotFoundException("Author with id [" + input.getId() + "] was not found"));

        if (!input.getName().isBlank())
            author.setName(input.getName());

        authorRepository.save(author);

        return AuthorEditOperationOutput.builder()
                .name(author.getName())
                .build();
    }
}
