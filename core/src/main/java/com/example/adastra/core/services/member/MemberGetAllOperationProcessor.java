package com.example.adastra.core.services.member;

import com.example.adastra.api.inputoutput.member.getall.MemberGetAllListOperationOutput;
import com.example.adastra.api.inputoutput.member.getall.MemberGetAllOperation;
import com.example.adastra.api.inputoutput.member.getall.MemberGetAllOperationInput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberGetAllOperationProcessor implements MemberGetAllOperation {
    @Override
    public MemberGetAllListOperationOutput process(MemberGetAllOperationInput input) {
        return null;
    }
}
