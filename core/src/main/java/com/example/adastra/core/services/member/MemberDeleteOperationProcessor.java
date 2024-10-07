package com.example.adastra.core.services.member;

import com.example.adastra.api.inputoutput.member.delete.MemberDeleteOperation;
import com.example.adastra.api.inputoutput.member.delete.MemberDeleteOperationInput;
import com.example.adastra.api.inputoutput.member.delete.MemberDeleteOperationOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberDeleteOperationProcessor implements MemberDeleteOperation {
    @Override
    public MemberDeleteOperationOutput process(MemberDeleteOperationInput input) {
        return null;
    }
}
