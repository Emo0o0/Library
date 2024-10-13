package com.example.adastra.api.inputoutput.member.getloansbymember;

import com.example.adastra.api.base.OperationResult;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberGetLoansListOperationOutput implements OperationResult {

    private List<MemberGetLoansOperationOutput> members;
}
