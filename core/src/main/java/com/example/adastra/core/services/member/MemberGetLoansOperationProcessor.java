package com.example.adastra.core.services.member;

import com.example.adastra.api.inputoutput.member.getloansbymember.MemberGetLoansListOperationOutput;
import com.example.adastra.api.inputoutput.member.getloansbymember.MemberGetLoansOperation;
import com.example.adastra.api.inputoutput.member.getloansbymember.MemberGetLoansOperationInput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberGetLoansOperationProcessor implements MemberGetLoansOperation {
    @Override
    public MemberGetLoansListOperationOutput process(MemberGetLoansOperationInput input) {
        return null;
    }
}
