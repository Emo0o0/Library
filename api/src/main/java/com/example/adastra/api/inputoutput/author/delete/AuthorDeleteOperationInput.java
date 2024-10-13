package com.example.adastra.api.inputoutput.author.delete;

import com.example.adastra.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDeleteOperationInput implements OperationInput {

    private String id;
}
