package com.example.adastra.core.services.member;

import com.example.adastra.api.inputoutput.member.create.MemberCreateOperation;
import com.example.adastra.api.inputoutput.member.create.MemberCreateOperationInput;
import com.example.adastra.api.inputoutput.member.create.MemberCreateOperationOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberCreateOperationProcessor implements MemberCreateOperation {
    @Override
    public MemberCreateOperationOutput process(MemberCreateOperationInput input) {
        return null;
    }
}
