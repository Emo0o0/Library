package com.example.adastra.core.services.member;

import com.example.adastra.api.inputoutput.member.resetpassword.MemberResetPasswordOperation;
import com.example.adastra.api.inputoutput.member.resetpassword.MemberResetPasswordOperationInput;
import com.example.adastra.api.inputoutput.member.resetpassword.MemberResetPasswordOperationOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberResetPasswordOperationProcessor implements MemberResetPasswordOperation {
    @Override
    public MemberResetPasswordOperationOutput process(MemberResetPasswordOperationInput input) {
        return null;
    }
}
