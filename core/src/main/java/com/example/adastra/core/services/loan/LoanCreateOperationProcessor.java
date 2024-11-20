package com.example.adastra.core.services.loan;

import com.example.adastra.api.inputoutput.loan.create.LoanCreateOperation;
import com.example.adastra.api.inputoutput.loan.create.LoanCreateOperationInput;
import com.example.adastra.api.inputoutput.loan.create.LoanCreateOperationOutput;
import com.example.adastra.core.exceptions.bookcopy.BookCopyIdNotFoundException;
import com.example.adastra.core.exceptions.member.MemberIdNotFoundException;
import com.example.adastra.persistence.entities.BookCopy;
import com.example.adastra.persistence.entities.Loan;
import com.example.adastra.persistence.entities.Member;
import com.example.adastra.persistence.repositories.BookCopyRepository;
import com.example.adastra.persistence.repositories.LoanRepository;
import com.example.adastra.persistence.repositories.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class LoanCreateOperationProcessor implements LoanCreateOperation {

    private final LoanRepository loanRepository;
    private final MemberRepository memberRepository;
    private final BookCopyRepository bookCopyRepository;

    @Override
    public LoanCreateOperationOutput process(LoanCreateOperationInput input) {

        Member member = memberRepository.findById(UUID.fromString(input.getMemberId()))
                .orElseThrow(() -> new MemberIdNotFoundException("Member with id [" + input.getMemberId() + "] was not found"));

        BookCopy bookCopy = bookCopyRepository.findById(UUID.fromString(input.getBookCopyId()))
                .orElseThrow(() -> new BookCopyIdNotFoundException("Book copy with id [" + input.getBookCopyId() + "] was not found"));

        Loan loan = Loan.builder()
                .member(member)
                .bookCopy(bookCopy)
                .dueDate(LocalDate.now().plusDays(14))
                .returnDate(null)
                .build();

        loanRepository.save(loan);

        return LoanCreateOperationOutput.builder()
                .memberName(member.getName())
                .bookCopyName(bookCopy.getBook().getTitle())
                .loanDate(loan.getLoanDate().toString())
                .dueDate(loan.getDueDate().toString())
                .build();
    }
}
