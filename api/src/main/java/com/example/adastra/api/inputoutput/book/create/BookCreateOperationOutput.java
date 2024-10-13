package com.example.adastra.api.inputoutput.book.create;

import com.example.adastra.api.base.OperationResult;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookCreateOperationOutput implements OperationResult {

    private String id;
}
