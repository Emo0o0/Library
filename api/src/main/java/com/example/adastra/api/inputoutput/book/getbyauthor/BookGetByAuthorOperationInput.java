package com.example.adastra.api.inputoutput.book.getbyauthor;

import com.example.adastra.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookGetByAuthorOperationInput implements OperationInput {

    private String name;

}
