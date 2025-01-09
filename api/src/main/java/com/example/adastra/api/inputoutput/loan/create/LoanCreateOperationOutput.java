package com.example.adastra.api.inputoutput.loan.create;

import com.example.adastra.api.base.OperationResult;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanCreateOperationOutput implements OperationResult {

    private String memberName;
    private List<String> bookCopyName;
    private String loanDate;
    private String dueDate;
}
