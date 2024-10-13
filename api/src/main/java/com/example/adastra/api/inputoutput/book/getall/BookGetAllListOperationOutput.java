package com.example.adastra.api.inputoutput.book.getall;

import com.example.adastra.api.base.OperationResult;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookGetAllListOperationOutput implements OperationResult {
    private List<BookGetAllOperationOutput> books;

}
