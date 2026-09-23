package com.masterclass.demo_jpa.model;

import jakarta.persistence.*;

@Entity 
@Table(name = "utilisateurs")
public class Utilisateur{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    @Column(unique = true, nullable = false)
    private String email;
    private int age;

    public Utilisateur(){}
    public Utilisateur(String nom, String email, int age){
        this.nom = nom;
        this.email = email;
        this.age = age;
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

}