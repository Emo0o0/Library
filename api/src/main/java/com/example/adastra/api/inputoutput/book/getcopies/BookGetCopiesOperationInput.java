package com.example.adastra.api.inputoutput.book.getcopies;

import com.example.adastra.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookGetCopiesOperationInput implements OperationInput {

    private String bookId;
}
