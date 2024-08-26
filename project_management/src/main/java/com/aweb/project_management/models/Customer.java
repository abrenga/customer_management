package com.aweb.project_management.models;


import jakarta.persistence.Table;

@Table
public class Customer {
    private int id;
    private String name;
    private String surname;
    private int age;
    private String CF;
    private String phone;
    private String email;
    private String numeroPratica;
    public Customer(String name, String surname, int age, String CF, String phone, String email, String numeroPratica) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.CF = CF;
        this.phone = phone;
        this.email = email;
        this.numeroPratica = numeroPratica;
    }
}
