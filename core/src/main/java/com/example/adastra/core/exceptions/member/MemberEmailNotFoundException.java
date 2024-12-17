package com.example.adastra.core.exceptions.member;

public class MemberEmailNotFoundException extends RuntimeException {
    public MemberEmailNotFoundException(String message) {
        super(message);
    }
}
