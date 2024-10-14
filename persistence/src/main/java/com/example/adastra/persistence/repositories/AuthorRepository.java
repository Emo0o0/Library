package com.example.adastra.persistence.repositories;

import com.example.adastra.persistence.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AuthorRepository extends JpaRepository<Author, UUID> {

    List<Author> findByAuthorIdIn(List<UUID> ids);

    Optional<Author> findByName(String name);
}
