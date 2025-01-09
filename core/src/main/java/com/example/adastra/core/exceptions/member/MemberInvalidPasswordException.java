package com.example.adastra.core.exceptions.member;

public class MemberInvalidPasswordException extends RuntimeException {
    public MemberInvalidPasswordException(String message) {
        super(message);
    }
}
