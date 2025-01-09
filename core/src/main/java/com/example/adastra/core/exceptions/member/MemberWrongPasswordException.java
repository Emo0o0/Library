package com.example.adastra.core.exceptions.member;

public class MemberWrongPasswordException extends RuntimeException {

    public MemberWrongPasswordException(String message) {
        super(message);
    }
}
