package com.masterclass.demo_CRUD.model;

public class Etudiant{
    private Long id;
    private String nom;
    private double moyenne;
    private String filiere;

    public Etudiant(Long id, String nom, double moyenne, String filiere){
        this.id = id;
        this.nom = nom;
        this.moyenne = moyenne;
        this.filiere = filiere;
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
    public double getMoyenne(){
        return moyenne;
    }
    public void setMoyenne(double moyenne){
        this.moyenne = moyenne;
    }
    public String getFiliere(){
        return filiere;
    }
    public void setFiliere(String filiere){
        this.filiere = filiere;
    }

}