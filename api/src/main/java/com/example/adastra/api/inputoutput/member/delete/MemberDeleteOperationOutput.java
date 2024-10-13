package com.example.adastra.api.inputoutput.member.delete;

import com.example.adastra.api.base.OperationResult;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberDeleteOperationOutput implements OperationResult {

    private boolean success;
}
