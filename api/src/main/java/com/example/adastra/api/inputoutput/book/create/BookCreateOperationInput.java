package com.example.adastra.api.inputoutput.book.create;

import com.example.adastra.api.base.OperationInput;
import com.example.adastra.api.inputoutput.author.AuthorDTO;
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
    private List<AuthorDTO> authors;
    private List<String> genres;

}
