package com.example.adastra.api.inputoutput.book.delete;

import com.example.adastra.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDeleteOperationInput implements OperationInput {

    private String id;

}
