package com.example.adastra.persistence.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class BookCopy {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID bookCopyId;
    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private BookCopyCondition condition;
    @Column(nullable = false, length = 100)
    private String location;
    @Column(nullable = false)
    private boolean available;
}
