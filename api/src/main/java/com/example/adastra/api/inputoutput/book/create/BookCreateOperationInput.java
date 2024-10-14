package com.example.adastra.api.inputoutput.book.create;

import com.example.adastra.api.base.OperationInput;
import com.example.adastra.persistence.entities.BookGenres;
import lombok.*;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookCreateOperationInput implements OperationInput {

    private String title;
    private String isbn;
    private List<String> authors;
    private Set<BookGenres> genres;

}
