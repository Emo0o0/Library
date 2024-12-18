package com.example.adastra.api.inputoutput.book;

import com.example.adastra.persistence.entities.Author;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {

    private String id;
    private String title;
    private String isbn;
    private List<Author> authors;
    private List<String> genres;
}
