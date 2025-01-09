package com.example.adastra.core.exceptions.loan;

public class LoanIdNotFoundException extends RuntimeException {
    public LoanIdNotFoundException(String message) {
        super(message);
    }
}
