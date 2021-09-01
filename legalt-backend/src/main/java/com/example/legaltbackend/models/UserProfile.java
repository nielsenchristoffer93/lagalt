package com.example.legaltbackend.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class UserProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    private String description;

    @ManyToMany
    @JoinTable(
            name = "user_profile_skills",
            joinColumns = {@JoinColumn(name = "user_profile_id")},
            inverseJoinColumns = {@JoinColumn(name = "skill_id")}
    )
    public List<Skills> skills;

    @ManyToMany
    @JoinTable(
            name = "user_applications",
            joinColumns = {@JoinColumn(name = "project_application_id")},
            inverseJoinColumns = {@JoinColumn(name = "user_profile_id")}
    )
    public List<ProjectApplications> projectApplications;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(String portfolio) {
        this.portfolio = portfolio;
    }

    public Boolean getHidden() {
        return isHidden;
    }

    public void setHidden(Boolean hidden) {
        isHidden = hidden;
    }

    @Column(nullable = false)
    private String portfolio;

    /*@Column(nullable = false)
    private String userImage;
    **/

    @Column(nullable = false)
    private Boolean isHidden;


}
