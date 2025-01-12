package com.example.adastra.rest.controllers;

import com.example.adastra.api.inputoutput.bookcopy.create.BookCopyCreateOperation;
import com.example.adastra.api.inputoutput.bookcopy.create.BookCopyCreateOperationInput;
import com.example.adastra.api.inputoutput.bookcopy.create.BookCopyCreateOperationOutput;
import com.example.adastra.api.inputoutput.bookcopy.delete.BookCopyDeleteOperation;
import com.example.adastra.api.inputoutput.bookcopy.delete.BookCopyDeleteOperationInput;
import com.example.adastra.api.inputoutput.bookcopy.delete.BookCopyDeleteOperationOutput;
import com.example.adastra.api.inputoutput.bookcopy.edit.BookCopyEditOperation;
import com.example.adastra.api.inputoutput.bookcopy.edit.BookCopyEditOperationInput;
import com.example.adastra.api.inputoutput.bookcopy.edit.BookCopyEditOperationOutput;
import com.example.adastra.api.inputoutput.bookcopy.getavailable.BookCopyGetAvailableListOperationOutput;
import com.example.adastra.api.inputoutput.bookcopy.getavailable.BookCopyGetAvailableOperation;
import com.example.adastra.api.inputoutput.bookcopy.getavailable.BookCopyGetAvailableOperationInput;
import com.example.adastra.api.inputoutput.bookcopy.getbyid.BookCopyGetByIdOperation;
import com.example.adastra.api.inputoutput.bookcopy.getbyid.BookCopyGetByIdOperationInput;
import com.example.adastra.api.inputoutput.bookcopy.getbyid.BookCopyGetByIdOperationOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/bookCopy")
public class BookCopyController {

    private final BookCopyCreateOperation bookCopyCreateOperation;
    private final BookCopyDeleteOperation bookCopyDeleteOperation;
    private final BookCopyEditOperation bookCopyEditOperation;
    private final BookCopyGetAvailableOperation bookCopyGetAvailableOperation;
    private final BookCopyGetByIdOperation bookCopyGetByIdOperation;

    @PostMapping("/create")
    public ResponseEntity<BookCopyCreateOperationOutput> createBookCopy(@RequestBody BookCopyCreateOperationInput input) {
        return ResponseEntity.status(201).body(bookCopyCreateOperation.process(input));
    }

    @DeleteMapping("/deletE")
    public ResponseEntity<BookCopyDeleteOperationOutput> deleteBookCopy(@RequestParam String id) {
        return ResponseEntity.status(200).body(bookCopyDeleteOperation.process(BookCopyDeleteOperationInput.builder()
                .id(id)
                .build()));
    }

    @PatchMapping("/edit")
    public ResponseEntity<BookCopyEditOperationOutput> editBookCopy(@RequestBody BookCopyEditOperationInput input) {
        return ResponseEntity.status(200).body(bookCopyEditOperation.process(input));
    }

    @GetMapping("/getAvailable/{bookId}")
    public ResponseEntity<BookCopyGetAvailableListOperationOutput> getAvailableBookCopies(@PathVariable String bookId) {
        return ResponseEntity.status(200).body(bookCopyGetAvailableOperation.process(BookCopyGetAvailableOperationInput.builder()
                .bookId(bookId)
                .build()));
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<BookCopyGetByIdOperationOutput> getById(@PathVariable String id) {
        return ResponseEntity.status(200).body(bookCopyGetByIdOperation.process(BookCopyGetByIdOperationInput.builder()
                .id(id)
                .build()));
    }

}
