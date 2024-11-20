package com.example.adastra.api.inputoutput.bookcopy.edit;

import com.example.adastra.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookCopyEditOperationInput implements OperationInput {

    private String id;
    private String condition;
    private String location;
    private String isAvailable;
}
