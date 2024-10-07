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
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID memberId;
    private String name;
    private String email;
    private String password;
    @OneToMany(mappedBy = "member")
    private List<Loan> loans;
}
