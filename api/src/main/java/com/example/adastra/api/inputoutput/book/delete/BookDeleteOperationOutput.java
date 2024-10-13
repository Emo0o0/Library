package com.example.adastra.api.inputoutput.book.delete;

import com.example.adastra.api.base.OperationResult;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDeleteOperationOutput implements OperationResult {

    private boolean success;
}
