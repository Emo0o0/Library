package com.example.adastra.api.inputoutput.loan.delete;

import com.example.adastra.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanDeleteOperationInput implements OperationInput {

    private String loanId;
}
