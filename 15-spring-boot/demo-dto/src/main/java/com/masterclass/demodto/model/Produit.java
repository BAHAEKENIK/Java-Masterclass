package com.masterclass.demodto.model;

import jakarta.persistence.*;

@Entity 
@Table(name = "produits")
public class Produit{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String nom;
    @Column(nullable = false)
    private double prix;
    @Column(nullable = false)
    private int stock;
    public Produit(){}
    public Produit(Long id, String nom, double prix, int stock){
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
        this.stock = stock;
    }
}