package com.example.legaltbackend.controllers;

import com.example.legaltbackend.models.Categories;
import com.example.legaltbackend.repositories.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    /**
     * Add Categories to the database
     *
     * @param categories - Categories
     * @return - the Categories
     */
    @PostMapping
    public ResponseEntity<Categories> addCategories(@RequestBody Categories categories) {
        Categories add = categoriesRepository.save(categories);
        HttpStatus status;
        status = HttpStatus.CREATED;
        return new ResponseEntity<>(add, status);
    }


    /**
     * Get specific Categories
     *
     * @param id -Categories id
     * @return - info about that specific Categories
     */
    @GetMapping("/{id}")
    public ResponseEntity<Categories> getSpecificCategories(@PathVariable Long id) {
        HttpStatus status;
        Categories add = new Categories();
        if (!categoriesRepository.existsById(id)) {
            status = HttpStatus.NOT_FOUND;
            return new ResponseEntity<>(add, status);
        }
        add = categoriesRepository.findById(id).get();
        status = HttpStatus.OK;
        return new ResponseEntity<>(add, status);
    }


    /**
     * Update Categories
     *
     * @param id        - Categories id
     * @param categories - the new Categories
     * @return - newly updated Categories.
     */
    @PutMapping("/{id}")
    public ResponseEntity<Categories> updateCategories(@PathVariable("id") Long id, @RequestBody Categories categories) {
        Optional<Categories> categoriesData = categoriesRepository.findById(id);
        if (categoriesData.isPresent()) {
            Categories category = categoriesData.get();
            category.setTitle(categories.getTitle());


            return new ResponseEntity<>(categoriesRepository.save(category), HttpStatus.OK);
        } else return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    /**
     * Delete Categories
     *
     * @param id - Categories-id to be deleted
     * @return - Categories without the deleted Categories.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteCategories(@PathVariable("id") long id) {
        try {
            categoriesRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
