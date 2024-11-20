package com.example.adastra.core.exceptions.member;

public class MemberIdNotFoundException extends RuntimeException{
    public MemberIdNotFoundException(String message) {
        super(message);
    }
}
