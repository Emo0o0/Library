package com.example.adastra.core.services.book;

import com.example.adastra.api.inputoutput.book.getcopies.BookGetCopiesListOperationOutput;
import com.example.adastra.api.inputoutput.book.getcopies.BookGetCopiesOperation;
import com.example.adastra.api.inputoutput.book.getcopies.BookGetCopiesOperationInput;
import com.example.adastra.api.inputoutput.book.getcopies.BookGetCopiesOperationOutput;
import com.example.adastra.core.exceptions.book.BookIdNotFoundException;
import com.example.adastra.persistence.entities.Book;
import com.example.adastra.persistence.entities.BookCopy;
import com.example.adastra.persistence.repositories.BookCopyRepository;
import com.example.adastra.persistence.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BookGetCopiesOperationProcessor implements BookGetCopiesOperation {

    private final BookCopyRepository bookCopyRepository;
    private final BookRepository bookRepository;

    @Override
    public BookGetCopiesListOperationOutput process(BookGetCopiesOperationInput input) {

        Book book = bookRepository.findById(UUID.fromString(input.getBookId()))
                .orElseThrow(() -> new BookIdNotFoundException("Book with id [" + input.getBookId() + "] was not found"));

        List<BookCopy> bookCopies = bookCopyRepository.findByBook(book);

        return BookGetCopiesListOperationOutput.builder()
                .bookCopies(bookCopies.stream().map(bookCopy -> BookGetCopiesOperationOutput.builder()
                                .title(book.getTitle())
                                .condition(bookCopy.getCondition().toString())
                                .location(bookCopy.getLocation())
                                .isAvailable(bookCopy.isAvailable())
                                .build())
                        .toList())
                .build();
    }
}
