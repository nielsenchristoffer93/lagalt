package com.example.legaltbackend.repositories;

import com.example.legaltbackend.models.MessageBoard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageBoardRepository extends JpaRepository<MessageBoard, Long> {
}

