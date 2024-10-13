package com.example.adastra.api.inputoutput.member.edit;

import com.example.adastra.api.base.OperationInput;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberEditOperationInput implements OperationInput {

    private String name;
    private String email;
}
