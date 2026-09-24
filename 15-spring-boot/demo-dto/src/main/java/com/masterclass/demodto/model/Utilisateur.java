package com.masterclass.demodto.model;


import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "utilisateurs")
public class Utilisateur{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String nom;

    @Column(nullable = false, unique = false)
    private String email;

    @Column(nullable=false)
    private String motDePasse;

    @Column(name ="created_at")
    private LocalDateTime createdAt;

    public Utilisateur(){}
    public Utilisateur(String nom, String email, String motDePasse, LocalDateTime createdAt){
        this.nom = nom;
        this.email = email;
        this.motDePasse = motDePasse;
        this.createdAt = createdAt;
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
    public String getMotDePasse(){
        return motDePasse;
    }
    public void setMotDePasse(String motDePasse){
        this.motDePasse=motDePasse;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt = createdAt;
    }
}