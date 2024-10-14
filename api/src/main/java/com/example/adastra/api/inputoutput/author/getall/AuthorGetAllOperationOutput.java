package com.example.adastra.api.inputoutput.author.getall;

import com.example.adastra.persistence.entities.Book;
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
    private List<Book> books;

}
