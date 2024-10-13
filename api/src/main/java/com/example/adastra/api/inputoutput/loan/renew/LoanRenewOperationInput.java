package com.example.adastra.api.inputoutput.loan.renew;

import com.example.adastra.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanRenewOperationInput implements OperationInput {

    private String loanId;
    private String dueDate;

}
