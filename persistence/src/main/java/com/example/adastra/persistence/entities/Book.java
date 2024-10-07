package com.example.adastra.persistence.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter(AccessLevel.PRIVATE)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID bookId;
    private String title;
    private String isbn;
    @ManyToOne
    @JoinColumn(name = "author_Id")
    private Author author;
    @Enumerated(EnumType.STRING)
    private BookGenres genre;
}
