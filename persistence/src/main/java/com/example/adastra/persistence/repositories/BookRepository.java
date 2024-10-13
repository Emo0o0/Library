package com.example.adastra.persistence.repositories;

import com.example.adastra.persistence.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookRepository extends JpaRepository<Book, UUID> {
}
