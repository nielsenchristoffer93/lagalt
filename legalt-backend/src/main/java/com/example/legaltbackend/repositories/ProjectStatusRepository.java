package com.example.legaltbackend.repositories;

import com.example.legaltbackend.models.ProjectStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectStatusRepository extends JpaRepository<ProjectStatus, Long> {
}
