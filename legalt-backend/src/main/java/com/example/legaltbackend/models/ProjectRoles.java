package com.example.legaltbackend.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class ProjectRoles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "role_id")
    private  Roles role;

    @OneToOne
    @JoinColumn(name = "user_id")
    private  Users user;

    @ManyToMany
    @JoinTable(
            name = "projects_roles",
            joinColumns = {@JoinColumn(name = "project_roles_id")},
            inverseJoinColumns = {@JoinColumn(name = "project_id")}
    )
    public List<Projects> projects;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
