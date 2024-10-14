package com.example.adastra.api.inputoutput.author.getall;

import com.example.adastra.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorGetAllOperationInput implements OperationInput {

    private int pageNumber;
    private int itemsPerPage;
}
