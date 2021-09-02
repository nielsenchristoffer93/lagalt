package com.example.legaltbackend.repositories;

import com.example.legaltbackend.models.ChatBoard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatMessagesRepository extends JpaRepository<ChatBoard, Long> {
}
