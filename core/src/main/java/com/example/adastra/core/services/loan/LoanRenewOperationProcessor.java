package com.example.adastra.core.services.loan;

import com.example.adastra.api.inputoutput.loan.renew.LoanRenewOperation;
import com.example.adastra.api.inputoutput.loan.renew.LoanRenewOperationInput;
import com.example.adastra.api.inputoutput.loan.renew.LoanRenewOperationOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoanRenewOperationProcessor implements LoanRenewOperation {
    @Override
    public LoanRenewOperationOutput process(LoanRenewOperationInput input) {
        return null;
    }
}
