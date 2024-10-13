package com.example.adastra.api.inputoutput.loan.returnloan;

import com.example.adastra.api.base.OperationResult;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanReturnOperationOutput implements OperationResult {

    private boolean success;
}
