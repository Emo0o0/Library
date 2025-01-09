package com.example.adastra.core.services.member;

import com.example.adastra.api.inputoutput.member.getall.MemberGetAllListOperationOutput;
import com.example.adastra.api.inputoutput.member.getall.MemberGetAllOperation;
import com.example.adastra.api.inputoutput.member.getall.MemberGetAllOperationInput;
import com.example.adastra.api.inputoutput.member.getall.MemberGetAllOperationOutput;
import com.example.adastra.persistence.entities.Member;
import com.example.adastra.persistence.repositories.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberGetAllOperationProcessor implements MemberGetAllOperation {

    private final MemberRepository memberRepository;

    @Override
    public MemberGetAllListOperationOutput process(MemberGetAllOperationInput input) {

        List<Member> members = memberRepository.findAll();

        return MemberGetAllListOperationOutput.builder()
                .members(members.stream().map(member -> MemberGetAllOperationOutput.builder()
                                .id(member.getMemberId().toString())
                                .email(member.getEmail())
                                .name(member.getName())
                                .build())
                        .toList())
                .build();

    }
}
