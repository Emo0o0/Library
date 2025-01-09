package com.example.adastra.persistence.entities;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID loanId;
    @ManyToOne
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;
    @OneToMany
    @JoinColumn(name = "loan_id", nullable = false)
    private List<BookCopy> bookCopies;
    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime loanDate;
    @Column(nullable = false)
    private LocalDate dueDate;
    private LocalDateTime returnDate;
}
