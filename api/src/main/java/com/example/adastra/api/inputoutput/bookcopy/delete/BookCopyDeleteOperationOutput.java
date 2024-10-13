package com.example.adastra.api.inputoutput.bookcopy.delete;

import com.example.adastra.api.base.OperationResult;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookCopyDeleteOperationOutput implements OperationResult {

    private boolean success;
}
