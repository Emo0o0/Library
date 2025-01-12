package com.example.adastra.api.inputoutput.author.getbyid;

import com.example.adastra.api.base.OperationResult;
import com.example.adastra.persistence.entities.Book;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorGetByIdOperationOutput implements OperationResult {

    private String id;
    private String name;
    private List<String> books;

}
