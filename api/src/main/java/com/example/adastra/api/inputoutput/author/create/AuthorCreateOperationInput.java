package com.example.adastra.api.inputoutput.author.create;

import com.example.adastra.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorCreateOperationInput implements OperationInput {

    private String name;

}
