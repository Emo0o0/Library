package com.example.adastra.api.inputoutput.member.getloansbymember;

import com.example.adastra.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberGetLoansOperationInput implements OperationInput {

    private String memberId;
}
