package com.example.adastra.core.exceptions.book;

public class BookIdNotFoundException extends RuntimeException{
    public BookIdNotFoundException(String message) {
        super(message);
    }
}
