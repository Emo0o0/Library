package com.example.adastra.api.inputoutput.member.resetpassword;

import com.example.adastra.api.base.OperationResult;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberResetPasswordOperationOutput implements OperationResult {

    private String success;
}
