package com.example.adastra.core.services.loan;

import com.example.adastra.api.inputoutput.loan.getall.LoanGetAllListOperationOutput;
import com.example.adastra.api.inputoutput.loan.getall.LoanGetAllOperation;
import com.example.adastra.api.inputoutput.loan.getall.LoanGetAllOperationInput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoanGetAllOperationProcessor implements LoanGetAllOperation {
    @Override
    public LoanGetAllListOperationOutput process(LoanGetAllOperationInput input) {
        return null;
    }
}
