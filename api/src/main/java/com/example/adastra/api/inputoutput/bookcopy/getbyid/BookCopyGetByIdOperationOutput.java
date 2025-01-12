package com.example.adastra.api.inputoutput.bookcopy.getbyid;

import com.example.adastra.api.base.OperationResult;
import com.example.adastra.persistence.entities.Book;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookCopyGetByIdOperationOutput implements OperationResult {

    private String id;
    private String bookId;
    private String bookTitle;
    private String condition;
    private String location;
    private boolean isAvailable;
}
