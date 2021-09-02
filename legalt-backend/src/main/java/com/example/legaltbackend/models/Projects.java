package com.example.legaltbackend.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Projects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;

    private byte[] image;

    @ManyToMany
    @JoinTable(
            name = "users_projects",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "project_id")}
    )
    public List<Users> users;

    @ManyToMany
    @JoinTable(
            name = "projects_tags",
            joinColumns = {@JoinColumn(name = "project_id")},
            inverseJoinColumns = {@JoinColumn(name = "project_tag_id")}
    )
    public List<ProjectTags> projectTags;

    @ManyToMany
    @JoinTable(
            name = "project_skills",
            joinColumns = {@JoinColumn(name = "skill_id")},
            inverseJoinColumns = {@JoinColumn(name = "project_id")}
    )
    public List<Skills> skills;

    @ManyToMany
    @JoinTable(
            name = "projects_applications",
            joinColumns = {@JoinColumn(name = "project_id")},
            inverseJoinColumns = {@JoinColumn(name = "project_application_id")}
    )
    public List<ProjectApplications> projectApplications;

    @OneToOne
    @JoinColumn(name = "project_status_id")
    private  ProjectStatus projectStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }

    public List<ProjectTags> getProjectTags() {
        return projectTags;
    }

    public void setProjectTags(List<ProjectTags> projectTags) {
        this.projectTags = projectTags;
    }

    public List<Skills> getSkills() {
        return skills;
    }

    public void setSkills(List<Skills> skills) {
        this.skills = skills;
    }

    public List<ProjectApplications> getProjectApplications() {
        return projectApplications;
    }

    public void setProjectApplications(List<ProjectApplications> projectApplications) {
        this.projectApplications = projectApplications;
    }

    public ProjectStatus getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(ProjectStatus projectStatus) {
        this.projectStatus = projectStatus;
    }
}
