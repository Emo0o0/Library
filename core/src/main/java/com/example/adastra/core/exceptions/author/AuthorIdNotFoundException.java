package com.example.adastra.core.exceptions.author;

public class AuthorIdNotFoundException extends RuntimeException{
    public AuthorIdNotFoundException(String message) {
        super(message);
    }
}
