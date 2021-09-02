package com.example.legaltbackend.models;

import javax.persistence.*;

@Entity
public class ChatMessages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private String message;

    @Column()
    private String timestamp;

    @ManyToOne
    @JoinColumn(name = "user_id")
    public Users user;

    @ManyToOne
    @JoinColumn(name = "chat_board_id")
    public ChatBoard chatBoard;
}
