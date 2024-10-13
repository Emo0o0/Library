package com.example.adastra.api.inputoutput.book.getbyauthor;

import com.example.adastra.api.base.OperationResult;
import lombok.*;

import java.util.List;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookGetByAuthorListOperationOutput implements OperationResult {

    private List<BookGetByAuthorOperationOutput> books;
}
