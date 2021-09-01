
package com.example.legaltbackend.models;

import javax.persistence.*;

@Entity
public class ProjectRoles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "role_id")
    private  Roles role;

    @Column(nullable = false)
    private Long projectId;

    @Column(nullable = false)
    private Long userId;




}
