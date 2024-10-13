package com.example.adastra.api.inputoutput.loan.create;

import com.example.adastra.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanCreateOperationInput implements OperationInput {

    private String memberId;
    private String bookCopyId;
    private String dueDate;
}
