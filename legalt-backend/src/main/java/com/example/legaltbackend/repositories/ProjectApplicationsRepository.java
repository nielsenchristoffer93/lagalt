package com.example.legaltbackend.repositories;

import com.example.legaltbackend.models.ProjectApplications;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectApplicationsRepository extends JpaRepository<ProjectApplications, Long> {
}

