package com.example.adastra.api.inputoutput.loan.renew;

import com.example.adastra.api.base.OperationResult;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanRenewOperationOutput implements OperationResult {

    private boolean success;
}
