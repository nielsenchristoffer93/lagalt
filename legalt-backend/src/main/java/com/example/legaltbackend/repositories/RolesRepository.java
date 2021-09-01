package com.example.legaltbackend.repositories;

import com.example.legaltbackend.models.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesRepository extends JpaRepository<Roles, Long> {
}
