package com.example.adastra.core.services.member;

import com.example.adastra.api.inputoutput.member.edit.MemberEditOperation;
import com.example.adastra.api.inputoutput.member.edit.MemberEditOperationInput;
import com.example.adastra.api.inputoutput.member.edit.MemberEditOperationOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberEditOperationProcessor implements MemberEditOperation {
    @Override
    public MemberEditOperationOutput process(MemberEditOperationInput input) {
        return null;
    }
}
