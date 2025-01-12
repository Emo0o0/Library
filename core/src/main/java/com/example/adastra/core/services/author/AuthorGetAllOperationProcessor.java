package com.example.adastra.core.services.author;

import com.example.adastra.api.inputoutput.author.getall.AuthorGetAllListOperationOutput;
import com.example.adastra.api.inputoutput.author.getall.AuthorGetAllOperation;
import com.example.adastra.api.inputoutput.author.getall.AuthorGetAllOperationInput;
import com.example.adastra.api.inputoutput.author.getall.AuthorGetAllOperationOutput;
import com.example.adastra.persistence.entities.Author;
import com.example.adastra.persistence.entities.Book;
import com.example.adastra.persistence.repositories.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AuthorGetAllOperationProcessor implements AuthorGetAllOperation {

    private final AuthorRepository authorRepository;

    @Override
    public AuthorGetAllListOperationOutput process(AuthorGetAllOperationInput input) {

        PageRequest pageRequest = PageRequest.of(input.getPageNumber() - 1, input.getItemsPerPage());

        List<Author> authors = authorRepository.findAll(pageRequest).getContent();

        return AuthorGetAllListOperationOutput.builder()
                .authors(authors.stream()
                        .map(author -> AuthorGetAllOperationOutput.builder()
                                .id(author.getAuthorId().toString())
                                .name(author.getName())
                                .books(author.getBooks().stream().map(Book::getTitle).toList())
                                .build()).collect(Collectors.toList()))
                .build();
    }
}
