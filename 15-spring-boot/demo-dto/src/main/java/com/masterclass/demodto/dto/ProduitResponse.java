package com.masterclass.demodto.dto;

public class ProduitResponse{
    private Long id;
    private String nom;
    private double prix;
    private int stock;
    public ProduitResponse(){}
    public ProduitResponse(Long id, String nom, double prix, int stock){
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.stock = stock;
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
    public double getPrix(){
        return prix;
    }
    public void setPrix(double prix){
        this.prix = prix;
    }
    public int getStock(){
        return stock;
    }
    public void setStock(int stock){
        this.stock= stock;
    }
}