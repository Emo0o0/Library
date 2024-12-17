package com.example.adastra.core.services.member;

import com.example.adastra.api.inputoutput.member.login.MemberLoginOperation;
import com.example.adastra.api.inputoutput.member.login.MemberLoginOperationInput;
import com.example.adastra.api.inputoutput.member.login.MemberLoginOperationOutput;
import com.example.adastra.core.exceptions.member.MemberEmailNotFoundException;
import com.example.adastra.core.services.jwt.JWTTokenProvider;
import com.example.adastra.persistence.repositories.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberLoginOperationProcessor implements MemberLoginOperation {

    private final AuthenticationManager authenticationManager;
    private final JWTTokenProvider jwtTokenProvider;
    private final MemberRepository memberRepository;

    @Override
    public MemberLoginOperationOutput process(MemberLoginOperationInput input) {

        if(!memberRepository.existsByEmail(input.getEmail())){
            throw new MemberEmailNotFoundException("Email not found");
        }
        
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(input.getEmail(), input.getPassword()));
        SecurityContext sc = SecurityContextHolder.getContext();
        sc.setAuthentication(authentication);

        String token = jwtTokenProvider.generateToken(authentication);

        return MemberLoginOperationOutput.builder()
                .jwt(token)
                .success(true)
                .build();
    }
}
