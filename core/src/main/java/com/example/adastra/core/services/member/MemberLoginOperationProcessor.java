package com.example.adastra.core.services.member;

import com.example.adastra.api.inputoutput.member.login.MemberLoginOperation;
import com.example.adastra.api.inputoutput.member.login.MemberLoginOperationInput;
import com.example.adastra.api.inputoutput.member.login.MemberLoginOperationOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberLoginOperationProcessor implements MemberLoginOperation {
    @Override
    public MemberLoginOperationOutput process(MemberLoginOperationInput input) {
        return null;
    }
}
