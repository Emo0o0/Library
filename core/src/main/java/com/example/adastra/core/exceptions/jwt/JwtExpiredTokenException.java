package com.example.adastra.core.exceptions.jwt;

public class JwtExpiredTokenException extends RuntimeException{
    public JwtExpiredTokenException(String message) {
        super(message);
    }
}
