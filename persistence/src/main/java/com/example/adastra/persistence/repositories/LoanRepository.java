package com.example.adastra.persistence.repositories;

import com.example.adastra.persistence.entities.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LoanRepository extends JpaRepository<Loan, UUID> {
}
