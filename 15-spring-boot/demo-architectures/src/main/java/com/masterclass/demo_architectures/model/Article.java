package com.masterclass.demo_architectures.model;

import java.time.LocalDate;

public class Article{
    private Long id;
    private String titre;
    private String contenu;
    private String auteur;
    private LocalDate datePublication;
    public Article(){}
    public Article(Long id, String titre, String contenu, String auteur, LocalDate datePublication){
        this.id = id;
        this.titre = titre;
        this.contenu = contenu;
        this.auteur = auteur;
        this.datePublication = datePublication;
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
    public String getAuteur(){
        return auteur;
    }
    public void setAuteur(String auteur){
        this.auteur = auteur;
    }
    public LocalDate getDatePublication(){
        return datePublication;
    }
    public void setDatePublication(LocalDate datePublication){
        this.datePublication = datePublication;
    }
}