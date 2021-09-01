package com.example.legaltbackend.repositories;

import com.example.legaltbackend.models.ProjectTags;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectTagsRepository extends JpaRepository<ProjectTags, Long> {
}
