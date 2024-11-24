package com.example.adastra.core.exceptions.jwt;

public class JwtStringClaimsEmptyException extends RuntimeException{
    public JwtStringClaimsEmptyException(String message) {
        super(message);
    }
}
