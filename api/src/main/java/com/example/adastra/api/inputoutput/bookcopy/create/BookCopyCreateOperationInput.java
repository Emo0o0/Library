package com.example.adastra.api.inputoutput.bookcopy.create;

import com.example.adastra.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookCopyCreateOperationInput implements OperationInput {

    private String bookId;
    private String bookCopyCondition;
    private String location;
    private boolean isAvailable;

}
