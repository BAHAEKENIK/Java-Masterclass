package com.masterclass.demodto.dto;
import java.time.LocalDate;
public class ArticleResponse{
    private Long id;
    private String nom;
    private LocalDate datePublication;
    private String nomAuteur;

    public ArticleResponse(){}
    public ArticleResponse(Long id, String nom, LocalDate datepublication, String nomAuteur){
        this.id = id;
        this.nom = nom;
        this.datePublication = datePublication;
        this.nomAuteur = nomAuteur;

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
    public String getNomAuteur(){
        return nomAuteur;
    }
    public void setNomAuteur(String nomAuteur){
        this.nomAuteur = nomAuteur;
    }
}