package com.masterclass.demodto.model;

import jakarta.persistence.*;
public class Auteur{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    public Auteur(){}
    public Auteur(Long id, String nom){
        this.id = id;
        this.nom = nom;
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
    
}