package com.example.adastra.api.inputoutput.author.getall;

import com.example.adastra.api.inputoutput.book.BookDTO;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorGetAllOperationOutput {

    private String id;
    private String name;
    private List<BookDTO> books;

}
