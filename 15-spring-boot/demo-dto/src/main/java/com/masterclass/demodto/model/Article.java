package com.masterclass.demodto.model;
import com.masterclass.demodto.model.Auteur;
import jakarta.persistence.*;
import java.time.LocalDate;
public class Article{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private LocalDate datePublication;
    @ManyToOne
    @JoinColumn(name = "auteur_id")
    private Auteur auteur;

    public Article(){}
    public Article(Long id, String nom, LocalDate datePublication, Auteur auteur){
        this.id = id;
        this.nom = nom;
        this.datePublication = datePublication;
        this.auteur = auteur;
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
    public LocalDate getDatePublication(){
        return datePublication;
    }
    public void setDatePublication(LocalDate datePublication){
        this.datePublication = datePublication;
    }
    public Auteur getAuteur(){
        return auteur;
    }
    public void setAuteur(Auteur auteur){
        this.auteur = auteur;
    }
    
}