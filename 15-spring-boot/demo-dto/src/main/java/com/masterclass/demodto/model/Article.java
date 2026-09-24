package com.masterclass.demodto.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity 
@Table(name = "articles")
public class Article{
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titre;


    @Column(length =  2000)
    private String contenu;

    @Column(name = "date_publication")
    private LocalDate datePublication;

    // Relation : Plusieurs articles -> Un auteur
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "auteur_id", nullable = false)
    private Auteur auteur;

    public Article(){}
    public Article(String titre, String contenu, LocalDate datePublication, Auteur auteur){
        this.titre = titre;
        this.contenu = contenu;
        this.datePublication = datePublication;
        this.auteur = auteur;
    }
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getTitre(){
        return titre;
    }
    public void setTitre(String titre){
        this.titre = titre;
    }
    public String getContenu(){
        return contenu;
    }
    public void setContenu(String contenu){
        this.contenu = contenu;
    }
    public Auteur getAuteur(){
        return auteur;
    }
    public void setAuteur(Auteur auteur){
        this.auteur = auteur;
    }
    public LocalDate getDatePublication(){
        return datePublication;
    }
    public void setDatePublication(LocalDate datePublication){
        this.datePublication = datePublication;
    }
}