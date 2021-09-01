package com.example.legaltbackend.controllers;

import com.example.legaltbackend.models.Projects;
import com.example.legaltbackend.repositories.ProjectsRepository;
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
@RequestMapping("/api/v1/projects")

public class ProjectsController {

    @Autowired
    private ProjectsRepository projectsRepository;

    /**
     * Get all projects in the database
     *
     * @return list of projects
     */
    @GetMapping
    public ResponseEntity<List<Projects>> getAllProjects() {
        List<Projects> data = projectsRepository.findAll();
        HttpStatus status = HttpStatus.OK;
        return new ResponseEntity<>(data, status);
    }
}
