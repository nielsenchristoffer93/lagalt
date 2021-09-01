package com.example.legaltbackend.repositories;

import com.example.legaltbackend.models.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<Categories, Long> {
}
