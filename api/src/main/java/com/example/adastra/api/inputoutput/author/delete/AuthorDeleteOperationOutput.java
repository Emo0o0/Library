package com.example.adastra.api.inputoutput.author.delete;

import com.example.adastra.api.base.OperationResult;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDeleteOperationOutput implements OperationResult {

    private boolean success;
}
