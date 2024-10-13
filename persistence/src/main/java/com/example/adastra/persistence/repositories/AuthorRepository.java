package com.example.adastra.persistence.repositories;

import com.example.adastra.persistence.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AuthorRepository extends JpaRepository<Author, UUID> {
}
