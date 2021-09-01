package com.example.legaltbackend.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Users {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false)
    private String username;

    @ManyToMany
    @JoinTable(
            name = "users_projects",
            joinColumns = {@JoinColumn(name = "project_id")},
            inverseJoinColumns = {@JoinColumn(name = "user_id")}
    )
    public List<Projects> projects;

    @OneToMany(mappedBy = "user")
    public List<UserHistory> userHistoryList;

    @OneToOne(mappedBy = "user")
    private UserProfile userProfile;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
