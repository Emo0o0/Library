package com.example.adastra.core.services.loan;

import com.example.adastra.api.inputoutput.loan.returnloan.LoanReturnOperation;
import com.example.adastra.api.inputoutput.loan.returnloan.LoanReturnOperationInput;
import com.example.adastra.api.inputoutput.loan.returnloan.LoanReturnOperationOutput;
import com.example.adastra.core.exceptions.loan.LoanIdNotFoundException;
import com.example.adastra.persistence.entities.BookCopy;
import com.example.adastra.persistence.entities.Loan;
import com.example.adastra.persistence.repositories.BookCopyRepository;
import com.example.adastra.persistence.repositories.LoanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class LoanReturnOperationProcessor implements LoanReturnOperation {

    private final LoanRepository loanRepository;
    private final BookCopyRepository bookCopyRepository;

    @Override
    public LoanReturnOperationOutput process(LoanReturnOperationInput input) {

        Loan loan = loanRepository.findById(UUID.fromString(input.getId()))
                .orElseThrow(() -> new LoanIdNotFoundException("Loan with id [" + input.getId() + "] was not found"));

        loan.setReturnDate(LocalDateTime.now());
        List<BookCopy> bookCopies = loan.getBookCopies();
        for (BookCopy bookCopy : bookCopies) {
            bookCopy.setAvailable(true);
            bookCopy.setLoan(null);
        }

        bookCopyRepository.saveAll(bookCopies);
        loanRepository.save(loan);

        return LoanReturnOperationOutput.builder()
                .success(true)
                .build();
    }
}
