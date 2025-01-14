package com.dragospascu.mma_betting_platform.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment primary key
    private Long id;

    private String fighter1;
    private String fighter2;
    private String date; // Use LocalDate or String for simplicity
    private String location;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFighter1() {
        return fighter1;
    }

    public void setFighter1(String fighter1) {
        this.fighter1 = fighter1;
    }

    public String getFighter2() {
        return fighter2;
    }

    public void setFighter2(String fighter2) {
        this.fighter2 = fighter2;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
