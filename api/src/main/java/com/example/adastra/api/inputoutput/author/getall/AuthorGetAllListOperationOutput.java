package com.example.adastra.api.inputoutput.author.getall;

import com.example.adastra.api.base.OperationResult;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorGetAllListOperationOutput implements OperationResult {

    private List<AuthorGetAllOperationOutput> authors;

}
