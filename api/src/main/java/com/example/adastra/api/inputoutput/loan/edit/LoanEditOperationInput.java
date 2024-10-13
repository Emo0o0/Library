package com.example.adastra.api.inputoutput.loan.edit;

import com.example.adastra.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanEditOperationInput implements OperationInput {

    private String dueDate;
}
