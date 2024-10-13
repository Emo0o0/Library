package com.example.adastra.api.inputoutput.member.getall;

import com.example.adastra.api.base.OperationResult;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberGetAllListOperationOutput implements OperationResult {

    private List<MemberGetAllOperationOutput> members;
}
