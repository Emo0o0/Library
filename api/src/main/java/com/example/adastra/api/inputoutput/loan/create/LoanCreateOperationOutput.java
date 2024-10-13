package com.example.adastra.api.inputoutput.loan.create;

import com.example.adastra.api.base.OperationResult;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanCreateOperationOutput implements OperationResult {

    private String memberName;
    private String bookCopyName;
    private String loanDate;
    private String dueDate;
}
