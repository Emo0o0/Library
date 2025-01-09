package com.example.adastra.core.exceptions.member;

public class MemberPasswordsNotMatchingException extends RuntimeException {
    public MemberPasswordsNotMatchingException(String message) {
        super(message);
    }
}
