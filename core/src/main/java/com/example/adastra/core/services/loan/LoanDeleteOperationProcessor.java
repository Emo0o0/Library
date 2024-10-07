package com.example.adastra.core.services.loan;

import com.example.adastra.api.inputoutput.loan.delete.LoanDeleteOperation;
import com.example.adastra.api.inputoutput.loan.delete.LoanDeleteOperationInput;
import com.example.adastra.api.inputoutput.loan.delete.LoanDeleteOperationOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoanDeleteOperationProcessor implements LoanDeleteOperation {
    @Override
    public LoanDeleteOperationOutput process(LoanDeleteOperationInput input) {
        return null;
    }
}
