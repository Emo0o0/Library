package com.example.adastra.core.exceptions.jwt;

public class JwtUnsupportedTokenException extends RuntimeException {
    public JwtUnsupportedTokenException(String message) {
        super(message);
    }
}
