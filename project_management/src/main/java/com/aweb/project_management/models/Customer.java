package com.aweb.project_management.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private int age;
    private String CF;
    private String phone;
    private String email;
    private String numeroPratica;

    public int getAge() {
        return age;
    }

    public String getCF() {
        return CF;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getNumeroPratica() {
        return numeroPratica;
    }

    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCF(String CF) {
        this.CF = CF;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumeroPratica(String numeroPratica) {
        this.numeroPratica = numeroPratica;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    @OneToMany(mappedBy = "tickets")
    private List<Ticket> ticketList;
}
