package com.example.adastra.api.inputoutput.book.getbyauthor;

import com.example.adastra.persistence.entities.Author;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookGetByAuthorOperationOutput {

    private String id;
    private String title;
    private String isbn;
    private List<Author> authors;
    private List<String> genres;

}
