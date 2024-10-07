package com.example.adastra.core.services.loan;

import com.example.adastra.api.inputoutput.loan.returnloan.LoanReturnOperation;
import com.example.adastra.api.inputoutput.loan.returnloan.LoanReturnOperationInput;
import com.example.adastra.api.inputoutput.loan.returnloan.LoanReturnOperationOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoanReturnOperationProcessor implements LoanReturnOperation {
    @Override
    public LoanReturnOperationOutput process(LoanReturnOperationInput input) {
        return null;
    }
}
