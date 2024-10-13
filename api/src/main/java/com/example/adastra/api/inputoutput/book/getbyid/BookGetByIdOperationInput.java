package com.example.adastra.api.inputoutput.book.getbyid;

import com.example.adastra.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookGetByIdOperationInput implements OperationInput {

    private String id;

}
