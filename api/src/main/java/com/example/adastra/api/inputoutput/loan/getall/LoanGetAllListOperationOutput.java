package com.example.adastra.api.inputoutput.loan.getall;

import com.example.adastra.api.base.OperationResult;
import com.example.adastra.persistence.entities.BookCopy;
import com.example.adastra.persistence.entities.Member;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoanGetAllListOperationOutput implements OperationResult {

    List<LoanGetAllOperationOutput> loans;
}
