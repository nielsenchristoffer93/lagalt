package com.example.legaltbackend.repositories;

import com.example.legaltbackend.models.Projects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectsRepository extends JpaRepository<Projects, Long> {
}
