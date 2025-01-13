package com.example.adastra.api.inputoutput.book.getcopies;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookGetCopiesOperationOutput {

    private String title;
    private String condition;
    private String location;
    private boolean isAvailable;
}
