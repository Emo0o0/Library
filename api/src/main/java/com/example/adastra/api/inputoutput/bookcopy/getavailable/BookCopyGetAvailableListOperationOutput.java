package com.example.adastra.api.inputoutput.bookcopy.getavailable;

import com.example.adastra.api.base.OperationResult;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookCopyGetAvailableListOperationOutput implements OperationResult {

    private List<BookCopyGetAvailableOperationOutput> books;
}
