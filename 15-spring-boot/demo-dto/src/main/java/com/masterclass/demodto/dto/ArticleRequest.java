package com.masterclass.demodto.dto;

public class ArticleRequest{
    private String nom;
    private Long auteurId;
    public ArticleRequest(){}

    public ArticleRequest(String nom, Long auteurId){
        this.nom = nom;
        this.auteurId = auteurId;
    }
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public Long getAuteurId(){
        return auteurId;
    }
    public void setAuteurId(Long auteurId){
        this.auteurId=auteurId;
    }
}