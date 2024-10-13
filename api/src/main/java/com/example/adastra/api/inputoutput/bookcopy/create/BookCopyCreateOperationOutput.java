package com.example.adastra.api.inputoutput.bookcopy.create;

import com.example.adastra.api.base.OperationResult;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookCopyCreateOperationOutput implements OperationResult {

    private String id;
}
