package com.example.legaltbackend.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class ProjectApplications {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(
            name = "user_applications",
            joinColumns = {@JoinColumn(name = "user_profile_id")},
            inverseJoinColumns = {@JoinColumn(name = "project_application_id")}
    )
    public List<UserProfile> userProfiles;

    @ManyToMany
    @JoinTable(
            name = "projects_applications",
            joinColumns = {@JoinColumn(name = "project_application_id")},
            inverseJoinColumns = {@JoinColumn(name = "project_id")}
    )
    public List<Projects> projects;

    @Column(nullable = false)
    private String motivation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMotivation() {
        return motivation;
    }

    public void setMotivation(String motivation) {
        this.motivation = motivation;
    }

    public List<UserProfile> getUserProfiles() {
        return userProfiles;
    }

    public void setUserProfiles(List<UserProfile> userProfiles) {
        this.userProfiles = userProfiles;
    }

    public List<Projects> getProjects() {
        return projects;
    }

    public void setProjects(List<Projects> projects) {
        this.projects = projects;
    }
}
