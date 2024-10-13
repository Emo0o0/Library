package com.example.adastra.api.inputoutput.bookcopy.edit;

import com.example.adastra.api.base.OperationResult;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookCopyEditOperationOutput implements OperationResult {

    private boolean success;

}
