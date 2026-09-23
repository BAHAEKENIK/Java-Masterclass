package com.masterclass.demo_jpa.model;
import jakarta.persistence.*;
@Entity 
@Table(name = "Auteurs")
public class Auteur {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    public Auteur(){}
    public Auteur(String nom){
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
