package com.example.legaltbackend.repositories;

import com.example.legaltbackend.models.ChatMessages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatMessagesRepository extends JpaRepository<ChatMessages, Long> {
}
