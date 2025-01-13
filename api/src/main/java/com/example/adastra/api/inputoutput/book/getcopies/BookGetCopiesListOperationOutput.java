package com.example.adastra.api.inputoutput.book.getcopies;

import com.example.adastra.api.base.OperationResult;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookGetCopiesListOperationOutput implements OperationResult {

    private List<BookGetCopiesOperationOutput> bookCopies;
}
