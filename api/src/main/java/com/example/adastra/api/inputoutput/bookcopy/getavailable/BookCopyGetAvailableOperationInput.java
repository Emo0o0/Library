package com.example.adastra.api.inputoutput.bookcopy.getavailable;

import com.example.adastra.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookCopyGetAvailableOperationInput implements OperationInput {

    private String bookId;
}
