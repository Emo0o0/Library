package com.example.adastra.api.inputoutput.bookcopy.getbyid;

import com.example.adastra.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookCopyGetByIdOperationInput implements OperationInput {

    private String id;
}
