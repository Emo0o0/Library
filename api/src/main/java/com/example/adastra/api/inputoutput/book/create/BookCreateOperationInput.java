package com.example.adastra.api.inputoutput.book.create;

import com.example.adastra.api.base.OperationInput;
import com.example.adastra.persistence.entities.Author;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookCreateOperationInput implements OperationInput {

    private String title;
    private String isbn;
    private List<Author> authors;
    private List<String> genres;

}
