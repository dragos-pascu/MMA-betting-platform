package com.dragospascu.mma_betting_platform.repository;

import com.dragospascu.mma_betting_platform.model.Fight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FightRepository extends JpaRepository<Fight, Long> {
    // Additional custom queries can be added here if needed
}
