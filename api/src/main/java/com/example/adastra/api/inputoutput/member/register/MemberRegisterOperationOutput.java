package com.example.adastra.api.inputoutput.member.register;

import com.example.adastra.api.base.OperationResult;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberRegisterOperationOutput implements OperationResult {

    private String id;
}
