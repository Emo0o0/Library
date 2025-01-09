package com.example.adastra.core.services.member;

import com.example.adastra.api.inputoutput.member.resetpassword.MemberResetPasswordOperation;
import com.example.adastra.api.inputoutput.member.resetpassword.MemberResetPasswordOperationInput;
import com.example.adastra.api.inputoutput.member.resetpassword.MemberResetPasswordOperationOutput;
import com.example.adastra.core.exceptions.member.MemberEmailNotFoundException;
import com.example.adastra.core.exceptions.member.MemberInvalidPasswordException;
import com.example.adastra.core.exceptions.member.MemberPasswordsNotMatchingException;
import com.example.adastra.core.exceptions.member.MemberWrongPasswordException;
import com.example.adastra.persistence.entities.Member;
import com.example.adastra.persistence.repositories.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberResetPasswordOperationProcessor implements MemberResetPasswordOperation {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;
    @Override
    public MemberResetPasswordOperationOutput process(MemberResetPasswordOperationInput input) {
//TODO issue new jwt token after password reset
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        Member member = memberRepository.findByEmail(authentication.getName())
                .orElseThrow(() -> new MemberEmailNotFoundException("Member with email [" + authentication.getName() + "] was not found"));

        validations(input, member.getPassword());

        member.setPassword(passwordEncoder.encode(input.getNewPassword()));
        memberRepository.save(member);

        return MemberResetPasswordOperationOutput.builder()
                .success(true)
                .build();
    }

    private void validations(MemberResetPasswordOperationInput input, String memberPassword) {
        if (!passwordEncoder.matches(input.getOldPassword(), memberPassword))
            throw new MemberWrongPasswordException("Incorrect password");

        if (input.getNewPassword().length() < 5)
            throw new MemberInvalidPasswordException("Password must be at least 5 symbols");


        if (!input.getNewPassword().equals(input.getConfirmNewPassword()))
            throw new MemberPasswordsNotMatchingException("Passwords do not match");
    }
}

