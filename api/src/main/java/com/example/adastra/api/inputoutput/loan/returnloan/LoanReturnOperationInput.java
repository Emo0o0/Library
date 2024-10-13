package com.example.adastra.api.inputoutput.loan.returnloan;

import com.example.adastra.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanReturnOperationInput implements OperationInput {

    private String id;
}
