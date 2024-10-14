package com.example.adastra.persistence.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID authorId;
    @Column(length = 100, nullable = false)
    private String name;
    @ManyToMany(mappedBy = "authors")
    private List<Book> books;
}
