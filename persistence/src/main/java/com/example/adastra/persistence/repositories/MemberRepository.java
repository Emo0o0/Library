package com.example.adastra.persistence.repositories;

import com.example.adastra.persistence.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface MemberRepository extends JpaRepository<Member, UUID> {
    Optional<Member> findByEmail(String email);
    Boolean existsByEmail(String email);
}
