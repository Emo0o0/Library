package com.example.adastra.rest.controllers;

import com.example.adastra.api.inputoutput.book.create.BookCreateOperation;
import com.example.adastra.api.inputoutput.book.create.BookCreateOperationInput;
import com.example.adastra.api.inputoutput.book.create.BookCreateOperationOutput;
import com.example.adastra.api.inputoutput.book.delete.BookDeleteOperation;
import com.example.adastra.api.inputoutput.book.delete.BookDeleteOperationInput;
import com.example.adastra.api.inputoutput.book.delete.BookDeleteOperationOutput;
import com.example.adastra.api.inputoutput.book.edit.BookEditOperation;
import com.example.adastra.api.inputoutput.book.edit.BookEditOperationInput;
import com.example.adastra.api.inputoutput.book.edit.BookEditOperationOutput;
import com.example.adastra.api.inputoutput.book.getall.BookGetAllListOperationOutput;
import com.example.adastra.api.inputoutput.book.getall.BookGetAllOperation;
import com.example.adastra.api.inputoutput.book.getall.BookGetAllOperationInput;
import com.example.adastra.api.inputoutput.book.getbyauthor.BookGetByAuthorListOperationOutput;
import com.example.adastra.api.inputoutput.book.getbyauthor.BookGetByAuthorOperation;
import com.example.adastra.api.inputoutput.book.getbyauthor.BookGetByAuthorOperationInput;
import com.example.adastra.api.inputoutput.book.getbyid.BookGetByIdOperation;
import com.example.adastra.api.inputoutput.book.getbyid.BookGetByIdOperationInput;
import com.example.adastra.api.inputoutput.book.getbyid.BookGetByIdOperationOutput;
import com.example.adastra.api.inputoutput.book.getcopies.BookGetCopiesListOperationOutput;
import com.example.adastra.api.inputoutput.book.getcopies.BookGetCopiesOperation;
import com.example.adastra.api.inputoutput.book.getcopies.BookGetCopiesOperationInput;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/book")
public class BookController {

    private final BookCreateOperation bookCreateOperation;
    private final BookDeleteOperation bookDeleteOperation;
    private final BookEditOperation bookEditOperation;
    private final BookGetAllOperation bookGetAllOperation;
    private final BookGetByAuthorOperation bookGetByAuthorOperation;
    private final BookGetByIdOperation bookGetByIdOperation;
    private final BookGetCopiesOperation bookGetCopiesOperation;

    @PostMapping("/create")
    public ResponseEntity<BookCreateOperationOutput> createBook(@RequestBody BookCreateOperationInput input) {
        return ResponseEntity.status(201).body(bookCreateOperation.process(input));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<BookDeleteOperationOutput> deleteBook(@RequestParam String id) {
        return ResponseEntity.status(200).body(bookDeleteOperation.process(BookDeleteOperationInput.builder()
                .id(id)
                .build()));
    }

    @PatchMapping("/edit")
    public ResponseEntity<BookEditOperationOutput> editBook(@RequestBody BookEditOperationInput input) {
        return ResponseEntity.status(200).body(bookEditOperation.process(input));
    }

    @GetMapping("/getAll")
    public ResponseEntity<BookGetAllListOperationOutput> getAllBooks(@RequestParam int pageNumber,
                                                                     @RequestParam int itemsPerPage) {
        return ResponseEntity.status(200).body(bookGetAllOperation.process(BookGetAllOperationInput.builder()
                .pageNumber(pageNumber)
                .itemsPerPage(itemsPerPage)
                .build()));
    }

    @GetMapping("/getCopies/{bookId}")
    public ResponseEntity<BookGetCopiesListOperationOutput> getBookCopies(@PathVariable String bookId) {
        return ResponseEntity.status(200).body(bookGetCopiesOperation.process(BookGetCopiesOperationInput.builder()
                .bookId(bookId)
                .build()));
    }

    @GetMapping("/getByAuthor/{authorName}")
    public ResponseEntity<BookGetByAuthorListOperationOutput> getBooksByAuthor(@PathVariable String authorName) {
        return ResponseEntity.status(200).body(bookGetByAuthorOperation.process(BookGetByAuthorOperationInput.builder()
                .name(authorName)
                .build()));
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<BookGetByIdOperationOutput> getBookById(@PathVariable String id) {
        return ResponseEntity.status(200).body(bookGetByIdOperation.process(BookGetByIdOperationInput.builder()
                .id(id)
                .build()));
    }

//    @GetMapping("/search")
//    public ResponseEntity<BookSearchOperationOutput> searchBooks() {
//        return ResponseEntity.status(200).body(bookSearchOperation.process(new BookSearchOperationInput()));
//    }
}
