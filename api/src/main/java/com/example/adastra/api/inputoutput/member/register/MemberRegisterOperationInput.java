package com.example.adastra.api.inputoutput.member.register;

import com.example.adastra.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberRegisterOperationInput implements OperationInput {

    private String name;
    private String email;
    private String password;

}
