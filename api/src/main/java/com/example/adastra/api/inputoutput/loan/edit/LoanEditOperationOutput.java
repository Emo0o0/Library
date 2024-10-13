package com.example.adastra.api.inputoutput.loan.edit;

import com.example.adastra.api.base.OperationResult;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanEditOperationOutput implements OperationResult {

    private String success;
}
