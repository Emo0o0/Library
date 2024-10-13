package com.example.adastra.api.inputoutput.author.edit;

import com.example.adastra.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorEditOperationInput implements OperationInput {

    private String id;
    private String name;
}
