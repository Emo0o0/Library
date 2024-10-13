package com.example.adastra.api.inputoutput.book.edit;

import com.example.adastra.api.base.OperationResult;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookEditOperationOutput implements OperationResult {

    private boolean success;

}
