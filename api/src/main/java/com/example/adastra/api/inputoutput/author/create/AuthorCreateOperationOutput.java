package com.example.adastra.api.inputoutput.author.create;

import com.example.adastra.api.base.OperationResult;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorCreateOperationOutput implements OperationResult {

    private String id;
}
