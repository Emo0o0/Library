package com.example.adastra.api.inputoutput.member.getloansbymember;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberGetLoansOperationOutput {

    private String loanId;
    private List<String> bookCopyIds;
    private String loanDate;
    private String dueDate;
    private String returnDate;
}
