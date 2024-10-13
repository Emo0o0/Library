package com.example.adastra.api.inputoutput.loan.delete;

import com.example.adastra.api.base.OperationResult;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanDeleteOperationOutput implements OperationResult {

    private boolean success;
}
