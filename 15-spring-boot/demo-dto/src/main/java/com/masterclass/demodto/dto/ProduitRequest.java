package com.masterclass.demodto.dto;

public class ProduitRequest{
    private String nom;

    public ProduitRequest(String nom){
        this.nom = nom;
    }
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
}