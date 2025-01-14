package com.dragospascu.mma_betting_platform.controller;

import com.dragospascu.mma_betting_platform.model.Fight;
import com.dragospascu.mma_betting_platform.repository.FightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fights")
public class FightController {

    @Autowired
    private FightRepository fightRepository;

    // Get all fights
    @GetMapping
    public List<Fight> getAllFights() {
        return fightRepository.findAll();
    }

    // Add a new fight
    @PostMapping
    public Fight addFight(@RequestBody Fight fight) {
        return fightRepository.save(fight);
    }
}
