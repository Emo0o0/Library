package com.example.adastra.rest.controllers;

import com.example.adastra.api.inputoutput.author.create.AuthorCreateOperation;
import com.example.adastra.api.inputoutput.author.create.AuthorCreateOperationInput;
import com.example.adastra.api.inputoutput.author.create.AuthorCreateOperationOutput;
import com.example.adastra.api.inputoutput.author.delete.AuthorDeleteOperation;
import com.example.adastra.api.inputoutput.author.delete.AuthorDeleteOperationInput;
import com.example.adastra.api.inputoutput.author.delete.AuthorDeleteOperationOutput;
import com.example.adastra.api.inputoutput.author.edit.AuthorEditOperation;
import com.example.adastra.api.inputoutput.author.edit.AuthorEditOperationInput;
import com.example.adastra.api.inputoutput.author.edit.AuthorEditOperationOutput;
import com.example.adastra.api.inputoutput.author.getall.AuthorGetAllListOperationOutput;
import com.example.adastra.api.inputoutput.author.getall.AuthorGetAllOperation;
import com.example.adastra.api.inputoutput.author.getall.AuthorGetAllOperationInput;
import com.example.adastra.api.inputoutput.author.getbyid.AuthorGetByIdOperation;
import com.example.adastra.api.inputoutput.author.getbyid.AuthorGetByIdOperationInput;
import com.example.adastra.api.inputoutput.author.getbyid.AuthorGetByIdOperationOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/author")
public class AuthorController {

    private final AuthorCreateOperation authorCreateOperation;
    private final AuthorDeleteOperation authorDeleteOperation;
    private final AuthorEditOperation authorEditOperation;
    private final AuthorGetAllOperation authorGetAllOperation;
    private final AuthorGetByIdOperation authorGetByIdOperation;

    @PostMapping("/create")
    public ResponseEntity<AuthorCreateOperationOutput> createAuthor(@RequestBody AuthorCreateOperationInput input) {
        return ResponseEntity.status(201).body(authorCreateOperation.process(input));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<AuthorDeleteOperationOutput> deleteAuthor(@RequestParam String id) {
        return ResponseEntity.status(200).body(authorDeleteOperation.process(AuthorDeleteOperationInput.builder()
                .id(id)
                .build()));
    }

    @PatchMapping("/edit")
    public ResponseEntity<AuthorEditOperationOutput> editAuthor(@RequestBody AuthorEditOperationInput input) {
        return ResponseEntity.status(200).body(authorEditOperation.process(input));
    }

    @GetMapping("/getAll")
    public ResponseEntity<AuthorGetAllListOperationOutput> getAllAuthors(@RequestParam int pageNumber,
                                                                         @RequestParam int itemsPerPage) {
        return ResponseEntity.status(200).body(authorGetAllOperation.process(AuthorGetAllOperationInput.builder()
                .pageNumber(pageNumber)
                .itemsPerPage(itemsPerPage)
                .build()));
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<AuthorGetByIdOperationOutput> getAuthorById(@PathVariable String id) {
        return ResponseEntity.status(200).body(authorGetByIdOperation.process(AuthorGetByIdOperationInput.builder()
                .id(id)
                .build()));
    }
}
