package com.example.adastra.persistence.repositories;

import com.example.adastra.persistence.entities.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MemberRepository extends JpaRepository<Member, UUID> {
}
