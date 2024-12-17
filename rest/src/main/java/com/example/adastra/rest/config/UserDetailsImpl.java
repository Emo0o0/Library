package com.example.adastra.rest.config;

import com.example.adastra.core.exceptions.member.MemberEmailNotFoundException;
import com.example.adastra.persistence.entities.Member;
import com.example.adastra.persistence.repositories.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.HashSet;

@Configuration
@RequiredArgsConstructor
public class UserDetailsImpl implements UserDetailsService {

    private final MemberRepository memberRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Member member = memberRepository.findByEmail(email)
                .orElseThrow(() -> new MemberEmailNotFoundException(email));
        return new User(member.getEmail(), member.getPassword(), new HashSet<>());
    }
}
