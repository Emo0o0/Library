package com.example.adastra.rest.controllers;

import com.example.adastra.api.inputoutput.loan.create.LoanCreateOperation;
import com.example.adastra.api.inputoutput.loan.create.LoanCreateOperationInput;
import com.example.adastra.api.inputoutput.loan.create.LoanCreateOperationOutput;
import com.example.adastra.api.inputoutput.loan.delete.LoanDeleteOperation;
import com.example.adastra.api.inputoutput.loan.delete.LoanDeleteOperationInput;
import com.example.adastra.api.inputoutput.loan.delete.LoanDeleteOperationOutput;
import com.example.adastra.api.inputoutput.loan.edit.LoanEditOperation;
import com.example.adastra.api.inputoutput.loan.getall.LoanGetAllListOperationOutput;
import com.example.adastra.api.inputoutput.loan.getall.LoanGetAllOperation;
import com.example.adastra.api.inputoutput.loan.getall.LoanGetAllOperationInput;
import com.example.adastra.api.inputoutput.loan.renew.LoanRenewOperation;
import com.example.adastra.api.inputoutput.loan.renew.LoanRenewOperationInput;
import com.example.adastra.api.inputoutput.loan.renew.LoanRenewOperationOutput;
import com.example.adastra.api.inputoutput.loan.returnloan.LoanReturnOperation;
import com.example.adastra.api.inputoutput.loan.returnloan.LoanReturnOperationInput;
import com.example.adastra.api.inputoutput.loan.returnloan.LoanReturnOperationOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/loan")
public class LoanController {

    private final LoanCreateOperation loanCreateOperation;
    private final LoanDeleteOperation loanDeleteOperation;
    private final LoanEditOperation loanEditOperation;
    private final LoanGetAllOperation loanGetAllOperation;
    private final LoanRenewOperation loanRenewOperation;
    private final LoanReturnOperation loanReturnOperation;

    @PostMapping("/create")
    public ResponseEntity<LoanCreateOperationOutput> createLoan(@RequestBody LoanCreateOperationInput input) {
        return ResponseEntity.status(201).body(loanCreateOperation.process(input));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<LoanDeleteOperationOutput> deleteLoan(@RequestParam String id) {
        return ResponseEntity.status(200).body(loanDeleteOperation.process(LoanDeleteOperationInput.builder()
                .loanId(id)
                .build()));
    }

    @PatchMapping("/renew")
    public ResponseEntity<LoanRenewOperationOutput> renewLoan(@RequestBody LoanRenewOperationInput input) {
        return ResponseEntity.status(200).body(loanRenewOperation.process(input));
    }

    @GetMapping("/getAll")
    public ResponseEntity<LoanGetAllListOperationOutput> getAllLoans() {
        return ResponseEntity.status(200).body(loanGetAllOperation.process(new LoanGetAllOperationInput()));
    }

    @GetMapping("/returnLoan")
    public ResponseEntity<LoanReturnOperationOutput> returnLoan(@RequestParam String id) {
        return ResponseEntity.status(200).body(loanReturnOperation.process(LoanReturnOperationInput.builder()
                .id(id)
                .build()));
    }

}
