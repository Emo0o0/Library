package com.example.adastra.persistence.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter
@Setter(AccessLevel.PRIVATE)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID authorId;
    private String name;
    @OneToMany(mappedBy = "author")
    private List<Book> books;
}
