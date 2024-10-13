package com.example.adastra.api.inputoutput.author.getbyid;

import com.example.adastra.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorGetByIdOperationInput implements OperationInput {

    private String id;

}
