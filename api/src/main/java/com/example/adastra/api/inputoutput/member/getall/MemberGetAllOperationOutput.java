package com.example.adastra.api.inputoutput.member.getall;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberGetAllOperationOutput {

    private String id;
    private String name;
    private String email;
}
