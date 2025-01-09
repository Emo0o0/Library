package com.example.adastra.api.inputoutput.loan.getall;

import com.example.adastra.api.base.OperationResult;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanGetAllOperationOutput {

    private String loanId;
    private String memberId;
    private List<String> bookCopiesIds;
    private String loanDate;
    private String dueDate;
    private String returnDate;

}
