package com.example.adastra.api.inputoutput.member.edit;

import com.example.adastra.api.base.OperationResult;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberEditOperationOutput implements OperationResult {

    private boolean success;
}
