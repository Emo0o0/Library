package com.example.adastra.api.inputoutput.book.getbyauthor;

import com.example.adastra.api.inputoutput.author.AuthorDTO;
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
    private List<AuthorDTO> authors;
    private List<String> genres;

}
