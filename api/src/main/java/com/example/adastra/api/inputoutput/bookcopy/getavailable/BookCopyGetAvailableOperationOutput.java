package com.example.adastra.api.inputoutput.bookcopy.getavailable;

import com.example.adastra.api.inputoutput.book.BookDTO;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookCopyGetAvailableOperationOutput {

    private String id;
    private BookDTO book;
    private String condition;
    private String location;
}
