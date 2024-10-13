package com.example.adastra.api.inputoutput.member.login;

import com.example.adastra.api.base.OperationResult;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberLoginOperationOutput implements OperationResult {

    private String success;
    private String jwt;
}
