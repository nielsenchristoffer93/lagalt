
package com.example.legaltbackend.models;

import javax.persistence.*;

@Entity
public class ProjectRoles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long projectId;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    private Long roleId;


}
