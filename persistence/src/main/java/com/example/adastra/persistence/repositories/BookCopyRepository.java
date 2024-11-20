package com.example.adastra.persistence.repositories;

import com.example.adastra.persistence.entities.Book;
import com.example.adastra.persistence.entities.BookCopy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface BookCopyRepository extends JpaRepository<BookCopy, UUID> {

    Boolean existsByBook(Book book);

    List<BookCopy> findByBookAndAvailable(Book book, Boolean isAvailable);
}
