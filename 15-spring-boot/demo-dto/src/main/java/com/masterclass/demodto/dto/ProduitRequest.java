package com.masterclass.demodto.dto;

public class ProduitRequest {
    private String nom;
    private double prix;
    private int stock;

    public ProduitRequest() {}  // ✅ Constructeur vide pour Jackson

    public ProduitRequest(String nom, double prix, int stock) {
        this.nom = nom;
        this.prix = prix;
        this.stock = stock;
    }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public double getPrix() { return prix; }
    public void setPrix(double prix) { this.prix = prix; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
}