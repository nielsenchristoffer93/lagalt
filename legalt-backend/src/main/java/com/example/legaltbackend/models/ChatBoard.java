package com.example.legaltbackend.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class ChatBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "project_id")
    private Projects project;


    @OneToMany(mappedBy = "chatBoard")
    private List<ChatMessages> chatMessages;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
