package com.example.adastra.core.services.loan;

import com.example.adastra.api.inputoutput.loan.create.LoanCreateOperation;
import com.example.adastra.api.inputoutput.loan.create.LoanCreateOperationInput;
import com.example.adastra.api.inputoutput.loan.create.LoanCreateOperationOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoanCreateOperationProcessor implements LoanCreateOperation {
    @Override
    public LoanCreateOperationOutput process(LoanCreateOperationInput input) {
        return null;
    }
}
