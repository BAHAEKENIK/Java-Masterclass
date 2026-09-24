package com.masterclass.demodto.dto;

import java.time.LocalDate;

public class ArticleResponse{
    private Long id;
    private String titre;
    private String contenu;
    private LocalDate datePublication;
    private String nomAuteur;

    public ArticleResponse(){

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
    public LocalDate getDatePublication(){
        return datePublication;
    }
    public void setDatePublication(LocalDate datePublication){
        this.datePublication = datePublication;
    }
    public String getNomAuteur(){
        return nomAuteur;
    }
    public void setNomAuteur(String nomAuteur){
        this.nomAuteur = nomAuteur;
    }
}