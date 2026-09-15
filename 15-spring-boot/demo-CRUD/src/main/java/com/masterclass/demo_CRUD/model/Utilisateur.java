package com.masterclass.demo_CRUD.model;

public class Utilisateur {
    private Long id;
    private String nom;
    private String email;
    private int age;

    // Default No-Argument Constructor (Required for frameworks like Hibernate/Jackson)
    public Utilisateur(){}

    // Parameterized Constructor
    public Utilisateur(Long id, String nom, String email, int age) {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.age = age;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
