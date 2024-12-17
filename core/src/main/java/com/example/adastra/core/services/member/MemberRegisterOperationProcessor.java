package com.example.adastra.core.services.member;

import com.example.adastra.api.inputoutput.member.register.MemberRegisterOperation;
import com.example.adastra.api.inputoutput.member.register.MemberRegisterOperationInput;
import com.example.adastra.api.inputoutput.member.register.MemberRegisterOperationOutput;
import com.example.adastra.core.exceptions.member.MemberAlreadyExistsException;
import com.example.adastra.persistence.entities.Member;
import com.example.adastra.persistence.repositories.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberRegisterOperationProcessor implements MemberRegisterOperation {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public MemberRegisterOperationOutput process(MemberRegisterOperationInput input) {
        if (memberRepository.existsByEmail(input.getEmail()))
            throw new MemberAlreadyExistsException("Member with email [" + input.getEmail() + "] already exists");

        Member member = Member.builder()
                .name(input.getName())
                .email(input.getEmail())
                .password(passwordEncoder.encode(input.getPassword()))
                .build();

        memberRepository.save(member);

        return MemberRegisterOperationOutput.builder()
                .id(member.getMemberId().toString())
                .build();
    }
}
