package com.example.adastra.api.inputoutput.book.edit;

import com.example.adastra.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookEditOperationInput implements OperationInput {

    private String title;
}
