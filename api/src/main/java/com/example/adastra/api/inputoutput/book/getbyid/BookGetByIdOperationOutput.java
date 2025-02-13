package com.example.adastra.api.inputoutput.book.getbyid;

import com.example.adastra.api.base.OperationResult;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookGetByIdOperationOutput implements OperationResult {

    private String id;
    private String title;
    private String isbn;
    private List<String> authors;
    private List<String> genres;
}
