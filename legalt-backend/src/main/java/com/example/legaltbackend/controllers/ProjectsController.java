package com.example.legaltbackend.controllers;

import com.example.legaltbackend.models.Projects;
import com.example.legaltbackend.repositories.ProjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

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
    /**
     * Get a specific Project by id
     *
     * @param id - Project id
     * @return -  Projects
     */
    @GetMapping("/{id}")
    public ResponseEntity<Projects> getProjectById(@PathVariable Long id) {
        Optional<Projects> projectsData = projectsRepository.findById(id);
        return projectsData.map(project -> new ResponseEntity<>(project, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    /**
     * Add a project to the database
     *
     * @param project - the added project
     * @return - the created project
     */
    @PostMapping
    public ResponseEntity<Projects> addProject(@RequestBody Projects project) {
        Projects add = projectsRepository.save(project);
        HttpStatus status;
        status = HttpStatus.CREATED;
        // Return a location -> url to get the new resource
        return new ResponseEntity<>(add, status);
    }

    /**
     * Update existing project
     *
     * @param project - the new project object
     * @param id        - the project id
     * @return the updated project.
     */
    @PutMapping("/{id}")
    public ResponseEntity<Projects> updateProject(@RequestBody Projects project, @PathVariable Long id) {
        HttpStatus status;
        Projects addProject = new Projects();
        if (!Objects.equals(id, project.getId())) {
            status = HttpStatus.BAD_REQUEST;
            return new ResponseEntity<>(addProject, status);
        }
        addProject = projectsRepository.save(project);
        status = HttpStatus.NO_CONTENT;
        return new ResponseEntity<>(addProject, status);
    }
    
    /**
     * Deletes project from the database
     *
     * @param id - project id
     * @return - the database without the deleted project.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteProject(@PathVariable("id") long id) {
        try {
            projectsRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
