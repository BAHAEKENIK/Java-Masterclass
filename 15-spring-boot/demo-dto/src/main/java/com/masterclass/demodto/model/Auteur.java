package com.masterclass.demodto.model;

import jakarta.persistence.*;
@Entity 
@Table(name = "auteurs")
public class Auteur{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    @Column(unique = true, nullable = false)
    private String email;

    public Auteur(){}
    public Auteur(Long id, String nom, String email){
        this.id = id;
        this.nom = nom;
        this.email = email;
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

}