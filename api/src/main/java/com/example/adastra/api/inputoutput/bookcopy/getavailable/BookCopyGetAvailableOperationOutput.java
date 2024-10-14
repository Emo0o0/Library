package com.example.adastra.api.inputoutput.bookcopy.getavailable;

import com.example.adastra.persistence.entities.Book;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookCopyGetAvailableOperationOutput {

    private String id;
    private Book book;
    private String condition;
    private String location;
}
