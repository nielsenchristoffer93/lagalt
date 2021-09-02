package com.example.legaltbackend.models;

import javax.persistence.*;

@Entity
public class Messages {

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
    @JoinColumn(name = "message_board_id")
    public MessageBoard messageBoard;

}
