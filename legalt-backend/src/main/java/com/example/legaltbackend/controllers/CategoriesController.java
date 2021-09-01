package com.example.legaltbackend.controllers;

import com.example.legaltbackend.models.Categories;
import com.example.legaltbackend.repositories.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/categories")

public class CategoriesController {
    @Autowired
    private CategoriesRepository categoriesRepository;



    /**
     * Get all categories
     *
     * @return - all categories
     */
    @GetMapping
    public ResponseEntity<List<Categories>> getAllCategories() {
        List<Categories> data = categoriesRepository.findAll();
        HttpStatus status = HttpStatus.OK;
        return new ResponseEntity<>(data, status);
    }

}
