package com.example.adastra.core.services.author;

import com.example.adastra.api.inputoutput.author.create.AuthorCreateOperation;
import com.example.adastra.api.inputoutput.author.create.AuthorCreateOperationInput;
import com.example.adastra.api.inputoutput.author.create.AuthorCreateOperationOutput;
import com.example.adastra.persistence.entities.Author;
import com.example.adastra.persistence.repositories.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorCreateOperationProcessor implements AuthorCreateOperation {

    private final AuthorRepository authorRepository;

    @Override
    public AuthorCreateOperationOutput process(AuthorCreateOperationInput input) {

        Author author = Author.builder()
                .name(input.getName())
                .build();

        authorRepository.save(author);

        return AuthorCreateOperationOutput.builder()
                .id(author.getAuthorId().toString())
                .build();

    }
}
