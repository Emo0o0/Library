package com.example.adastra.api.inputoutput.bookcopy.delete;

import com.example.adastra.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookCopyDeleteOperationInput implements OperationInput {

    private String id;
}
