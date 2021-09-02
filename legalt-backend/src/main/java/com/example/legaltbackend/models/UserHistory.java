package com.example.legaltbackend.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class UserHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String projectId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    public Users user;

    @ManyToMany
    @JoinTable(
            name = "projects_user_history",
            joinColumns = {@JoinColumn(name = "user_history_id")},
            inverseJoinColumns = {@JoinColumn(name = "project_id")}
    )
    public List<Projects> projects;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
