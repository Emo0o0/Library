package com.example.adastra.core.services.member;

import com.example.adastra.api.inputoutput.member.register.MemberRegisterOperation;
import com.example.adastra.api.inputoutput.member.register.MemberRegisterOperationInput;
import com.example.adastra.api.inputoutput.member.register.MemberRegisterOperationOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberRegisterOperationProcessor implements MemberRegisterOperation {
    @Override
    public MemberRegisterOperationOutput process(MemberRegisterOperationInput input) {
        return null;
    }
}
