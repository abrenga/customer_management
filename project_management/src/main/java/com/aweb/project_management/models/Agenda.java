package com.aweb.project_management.models;

import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Table
public class Agenda {
    private int id;
    private String agenda;
    private LocalDateTime date;
    public Agenda() {

    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getAgenda() {
        return agenda;
    }
    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }
    public LocalDateTime getDate() {
        return date;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }

}
