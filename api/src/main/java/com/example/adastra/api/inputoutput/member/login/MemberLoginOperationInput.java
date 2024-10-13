package com.example.adastra.api.inputoutput.member.login;

import com.example.adastra.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberLoginOperationInput implements OperationInput {

    private String email;
    private String password;
}
