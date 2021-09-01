package com.example.legaltbackend.repositories;

import com.example.legaltbackend.models.Skills;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillsRepository extends JpaRepository<Skills, Long> {
}
