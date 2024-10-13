package com.example.adastra.rest.controllers;

import com.example.adastra.api.inputoutput.member.delete.MemberDeleteOperation;
import com.example.adastra.api.inputoutput.member.delete.MemberDeleteOperationInput;
import com.example.adastra.api.inputoutput.member.delete.MemberDeleteOperationOutput;
import com.example.adastra.api.inputoutput.member.edit.MemberEditOperation;
import com.example.adastra.api.inputoutput.member.edit.MemberEditOperationInput;
import com.example.adastra.api.inputoutput.member.edit.MemberEditOperationOutput;
import com.example.adastra.api.inputoutput.member.getall.MemberGetAllListOperationOutput;
import com.example.adastra.api.inputoutput.member.getall.MemberGetAllOperation;
import com.example.adastra.api.inputoutput.member.getall.MemberGetAllOperationInput;
import com.example.adastra.api.inputoutput.member.getloansbymember.MemberGetLoansListOperationOutput;
import com.example.adastra.api.inputoutput.member.getloansbymember.MemberGetLoansOperation;
import com.example.adastra.api.inputoutput.member.getloansbymember.MemberGetLoansOperationInput;
import com.example.adastra.api.inputoutput.member.login.MemberLoginOperation;
import com.example.adastra.api.inputoutput.member.login.MemberLoginOperationInput;
import com.example.adastra.api.inputoutput.member.login.MemberLoginOperationOutput;
import com.example.adastra.api.inputoutput.member.register.MemberRegisterOperation;
import com.example.adastra.api.inputoutput.member.register.MemberRegisterOperationInput;
import com.example.adastra.api.inputoutput.member.register.MemberRegisterOperationOutput;
import com.example.adastra.api.inputoutput.member.resetpassword.MemberResetPasswordOperation;
import com.example.adastra.api.inputoutput.member.resetpassword.MemberResetPasswordOperationInput;
import com.example.adastra.api.inputoutput.member.resetpassword.MemberResetPasswordOperationOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/member")
public class MemberController {

    private final MemberDeleteOperation memberDeleteOperation;
    private final MemberEditOperation memberEditOperation;
    private final MemberGetAllOperation memberGetAllOperation;
    private final MemberGetLoansOperation memberGetLoansOperation;
    private final MemberLoginOperation memberLoginOperation;
    private final MemberRegisterOperation memberRegisterOperation;
    private final MemberResetPasswordOperation memberResetPasswordOperation;


    @PostMapping("/login")
    public ResponseEntity<MemberLoginOperationOutput> loginMember(@RequestBody MemberLoginOperationInput input) {
        return ResponseEntity.status(200).body(memberLoginOperation.process(input));
    }

    @PostMapping("/register")
    public ResponseEntity<MemberRegisterOperationOutput> registerMember(@RequestBody MemberRegisterOperationInput input) {
        return ResponseEntity.status(201).body(memberRegisterOperation.process(input));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<MemberDeleteOperationOutput> deleteMember(@RequestBody MemberDeleteOperationInput input) {
        return ResponseEntity.status(200).body(memberDeleteOperation.process(input));
    }

    @PatchMapping("/edit")
    public ResponseEntity<MemberEditOperationOutput> editMember(@RequestBody MemberEditOperationInput input) {
        return ResponseEntity.status(200).body(memberEditOperation.process(input));
    }

    @PatchMapping("/reset")
    public ResponseEntity<MemberResetPasswordOperationOutput> resetPassword(@RequestBody MemberResetPasswordOperationInput input) {
        return ResponseEntity.status(200).body(memberResetPasswordOperation.process(input));
    }

    @GetMapping("/getAll")
    public ResponseEntity<MemberGetAllListOperationOutput> getAllMembers() {
        return ResponseEntity.status(200).body(memberGetAllOperation.process(new MemberGetAllOperationInput()));
    }

    @GetMapping("/getMemberLoans/{id}")
    public ResponseEntity<MemberGetLoansListOperationOutput> getMemberLoans(@PathVariable String id) {
        return ResponseEntity.status(200).body(memberGetLoansOperation.process(MemberGetLoansOperationInput.builder()
                .memberId(id)
                .build()));
    }


}
