package com.example.legaltbackend.repositories;

import com.example.legaltbackend.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
