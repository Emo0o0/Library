package com.example.adastra.api.inputoutput.member.resetpassword;

import com.example.adastra.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberResetPasswordOperationInput implements OperationInput {

    private String oldPassword;
    private String newPassword;
    private String confirmNewPassword;
}
