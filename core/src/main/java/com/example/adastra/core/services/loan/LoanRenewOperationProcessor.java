package com.example.adastra.core.services.loan;

import com.example.adastra.api.inputoutput.loan.renew.LoanRenewOperation;
import com.example.adastra.api.inputoutput.loan.renew.LoanRenewOperationInput;
import com.example.adastra.api.inputoutput.loan.renew.LoanRenewOperationOutput;
import com.example.adastra.core.exceptions.loan.LoanIdNotFoundException;
import com.example.adastra.persistence.entities.Loan;
import com.example.adastra.persistence.repositories.LoanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class LoanRenewOperationProcessor implements LoanRenewOperation {

    private final LoanRepository loanRepository;

    @Override
    public LoanRenewOperationOutput process(LoanRenewOperationInput input) {

        Loan loan = loanRepository.findById(UUID.fromString(input.getLoanId()))
                .orElseThrow(() -> new LoanIdNotFoundException("Loan with id [" + input.getLoanId() + "] was not found"));

        loan.setDueDate(loan.getDueDate().plusDays(Integer.parseInt(input.getDays())));

        loanRepository.save(loan);

        return LoanRenewOperationOutput.builder()
                .success(true)
                .build();
    }
}
