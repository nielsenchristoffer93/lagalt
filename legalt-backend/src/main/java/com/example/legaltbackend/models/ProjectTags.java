package com.example.legaltbackend.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class ProjectTags {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    //    @Column(nullable = false)
//    private Long projectId;
    @ManyToMany
    @JoinTable(
            name = "projects_tags",
            joinColumns = {@JoinColumn(name = "project_tag_id")},
            inverseJoinColumns = {@JoinColumn(name = "project_id")}
    )
    public List<Projects> projects;

    @Column()
    private String tag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public Long getProjectId() {
//        return projectId;
//    }
//
//    public void setProjectId(Long projectId) {
//        this.projectId = projectId;
//    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public List<Projects> getProjects() {
        return projects;
    }

    public void setProjects(List<Projects> projects) {
        this.projects = projects;
    }
}
