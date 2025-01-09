package com.example.adastra.core.services.loan;

import com.example.adastra.api.inputoutput.loan.getall.LoanGetAllListOperationOutput;
import com.example.adastra.api.inputoutput.loan.getall.LoanGetAllOperation;
import com.example.adastra.api.inputoutput.loan.getall.LoanGetAllOperationInput;
import com.example.adastra.api.inputoutput.loan.getall.LoanGetAllOperationOutput;
import com.example.adastra.persistence.entities.Loan;
import com.example.adastra.persistence.repositories.LoanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class LoanGetAllOperationProcessor implements LoanGetAllOperation {

    private final LoanRepository loanRepository;

    @Override
    public LoanGetAllListOperationOutput process(LoanGetAllOperationInput input) {

        List<Loan> loans = loanRepository.findAll();

        return LoanGetAllListOperationOutput.builder()
                .loans(loans.stream().map(loan -> LoanGetAllOperationOutput.builder()
                                .loanId(loan.getLoanId().toString())
                                .memberId(loan.getMember().getMemberId().toString())
                                .bookCopiesIds(loan.getBookCopies().stream().map(bookCopy -> String.valueOf(bookCopy.getBookCopyId())).toList())
                                .loanDate(loan.getLoanDate().toString())
                                .dueDate(loan.getDueDate().toString())
                                .returnDate(loan.getReturnDate() != null ? loan.getReturnDate().toString() : "Not returned yet")
                                .build())
                        .toList())
                .build();

    }
}
