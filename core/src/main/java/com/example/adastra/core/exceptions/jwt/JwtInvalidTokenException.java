package com.example.adastra.core.exceptions.jwt;

public class JwtInvalidTokenException extends RuntimeException{
    public JwtInvalidTokenException(String message) {
        super(message);
    }
}
