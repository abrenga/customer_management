package com.aweb.project_management.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String appoiment;
    private LocalDateTime date;
    public Event() {

    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAppoiment() {
        return appoiment;
    }
    public void setAppoiment(String agenda) {
        this.appoiment = agenda;
    }
    public LocalDateTime getDate() {
        return date;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }

}
