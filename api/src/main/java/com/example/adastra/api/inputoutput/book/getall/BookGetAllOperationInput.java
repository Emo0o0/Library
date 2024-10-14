package com.example.adastra.api.inputoutput.book.getall;

import com.example.adastra.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookGetAllOperationInput implements OperationInput {

    private int pageNumber;
    private int itemsPerPage;
}
