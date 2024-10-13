package com.example.adastra.api.inputoutput.author.edit;

import com.example.adastra.api.base.OperationResult;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorEditOperationOutput implements OperationResult {

    private String name;

}
