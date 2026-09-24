package com.masterclass.demodto.dto;

public class AuteurRequest{
    private String nom;

    public AuteurRequest(){}
    public AuteurRequest(String nom){
        this.nom = nom;
    }
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
}