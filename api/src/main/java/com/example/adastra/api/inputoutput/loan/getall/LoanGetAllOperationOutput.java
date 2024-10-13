package com.example.adastra.api.inputoutput.loan.getall;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanGetAllOperationOutput {

    private String loanId;
    private String memberId;
    private String bookCopyId;
    private String loanDate;
    private String dueDate;
    private String returnDate;

}
