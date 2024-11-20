package com.example.adastra.api.inputoutput.bookcopy.getavailable;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookCopyGetAvailableOperationOutput {

    private String id;
    private String condition;
    private String location;
}
