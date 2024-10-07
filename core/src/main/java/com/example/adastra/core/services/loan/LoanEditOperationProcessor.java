package com.example.adastra.core.services.loan;

import com.example.adastra.api.inputoutput.loan.edit.LoanEditOperation;
import com.example.adastra.api.inputoutput.loan.edit.LoanEditOperationInput;
import com.example.adastra.api.inputoutput.loan.edit.LoanEditOperationOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoanEditOperationProcessor implements LoanEditOperation {
    @Override
    public LoanEditOperationOutput process(LoanEditOperationInput input) {
        return null;
    }
}
