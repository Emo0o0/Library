package com.example.adastra.core.services.member;

import com.example.adastra.api.inputoutput.member.getloansbymember.MemberGetLoansListOperationOutput;
import com.example.adastra.api.inputoutput.member.getloansbymember.MemberGetLoansOperation;
import com.example.adastra.api.inputoutput.member.getloansbymember.MemberGetLoansOperationInput;
import com.example.adastra.api.inputoutput.member.getloansbymember.MemberGetLoansOperationOutput;
import com.example.adastra.core.exceptions.member.MemberEmailNotFoundException;
import com.example.adastra.persistence.entities.Member;
import com.example.adastra.persistence.repositories.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberGetLoansOperationProcessor implements MemberGetLoansOperation {

    private MemberRepository memberRepository;

    @Override
    public MemberGetLoansListOperationOutput process(MemberGetLoansOperationInput input) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        Member member = memberRepository.findByEmail(authentication.getName())
                .orElseThrow(() -> new MemberEmailNotFoundException("Member with email [" + authentication.getName() + "] was not found"));

        return MemberGetLoansListOperationOutput.builder()
                .loans(member.getLoans().stream().map(loan -> MemberGetLoansOperationOutput.builder()
                        .loanId(loan.getLoanId().toString())
                        .bookCopyIds(loan.getBookCopies().stream().map(bookCopy -> String.valueOf(bookCopy.getBookCopyId())).toList())
                        .loanDate(loan.getLoanDate().toString())
                        .dueDate(loan.getDueDate().toString())
                        .returnDate(loan.getReturnDate().toString())
                        .build()).toList())
                .build();
    }
}
