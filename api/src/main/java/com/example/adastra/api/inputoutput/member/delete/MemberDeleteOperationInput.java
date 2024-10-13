package com.example.adastra.api.inputoutput.member.delete;

import com.example.adastra.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberDeleteOperationInput implements OperationInput {

    private String password;
}
