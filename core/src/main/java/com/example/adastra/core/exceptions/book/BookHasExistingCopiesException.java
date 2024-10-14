package com.example.adastra.core.exceptions.book;

public class BookHasExistingCopiesException extends RuntimeException{
    public BookHasExistingCopiesException(String message) {
        super(message);
    }
}
