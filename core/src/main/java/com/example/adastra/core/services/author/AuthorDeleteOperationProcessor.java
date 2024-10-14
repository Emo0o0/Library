package com.example.adastra.core.services.author;

import com.example.adastra.api.inputoutput.author.delete.AuthorDeleteOperation;
import com.example.adastra.api.inputoutput.author.delete.AuthorDeleteOperationInput;
import com.example.adastra.api.inputoutput.author.delete.AuthorDeleteOperationOutput;
import com.example.adastra.core.exceptions.author.AuthorHasBooksException;
import com.example.adastra.core.exceptions.author.AuthorIdNotFoundException;
import com.example.adastra.persistence.entities.Author;
import com.example.adastra.persistence.repositories.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AuthorDeleteOperationProcessor implements AuthorDeleteOperation {

    private final AuthorRepository authorRepository;

    @Override
    public AuthorDeleteOperationOutput process(AuthorDeleteOperationInput input) {

        Author author = authorRepository.findById(UUID.fromString(input.getId()))
                .orElseThrow(() -> new AuthorIdNotFoundException("Author with id [" + input.getId() + "] was not found"));
        if (!author.getBooks().isEmpty())
            throw new AuthorHasBooksException("This author has books. Cannot delete");

        authorRepository.delete(author);

        return AuthorDeleteOperationOutput.builder()
                .success(true)
                .build();
    }
}
