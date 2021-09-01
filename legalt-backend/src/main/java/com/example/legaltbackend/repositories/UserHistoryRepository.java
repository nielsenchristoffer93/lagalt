package com.example.legaltbackend.repositories;

import com.example.legaltbackend.models.UserHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserHistoryRepository extends JpaRepository<UserHistory, Long> {
}

