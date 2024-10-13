package com.example.adastra.api.inputoutput.book;

import com.example.adastra.api.inputoutput.author.AuthorDTO;
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
    private List<AuthorDTO> authors;
    private List<String> genres;
}