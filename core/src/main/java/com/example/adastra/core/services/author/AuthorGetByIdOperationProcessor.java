package com.example.adastra.core.services.author;

import com.example.adastra.api.inputoutput.author.getbyid.AuthorGetByIdOperation;
import com.example.adastra.api.inputoutput.author.getbyid.AuthorGetByIdOperationInput;
import com.example.adastra.api.inputoutput.author.getbyid.AuthorGetByIdOperationOutput;
import com.example.adastra.core.exceptions.author.AuthorIdNotFoundException;
import com.example.adastra.persistence.entities.Author;
import com.example.adastra.persistence.entities.Book;
import com.example.adastra.persistence.repositories.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AuthorGetByIdOperationProcessor implements AuthorGetByIdOperation {

    private final AuthorRepository authorRepository;

    @Override
    public AuthorGetByIdOperationOutput process(AuthorGetByIdOperationInput input) {

        Author author = authorRepository.findById(UUID.fromString(input.getId()))
                .orElseThrow(() -> new AuthorIdNotFoundException("Author with id [" + input.getId() + "] was not found"));

        return AuthorGetByIdOperationOutput.builder()
                .id(author.getAuthorId().toString())
                .name(author.getName())
                .books(author.getBooks().stream().map(Book::getTitle).toList())
                .build();
    }
}
