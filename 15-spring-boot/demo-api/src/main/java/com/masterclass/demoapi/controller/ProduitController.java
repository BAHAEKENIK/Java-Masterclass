package com.masterclass.demoapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.ArrayList;
import com.masterclass.demoapi.model.*;
@RestController 
@RequestMapping("/api/produits")
public class ProduitController{
    @GetMapping
    public List<Produit> ListerProduits(){
        
        List<Produit> produits = new ArrayList<>();
        produits.add(new Produit(55424L, "souri", 15.15,15));
        produits.add(new Produit(75647L, "ordinateur", 10000,15));
        produits.add(new Produit(754774L, "table", 1547.564, 15));
        return produits;
    }
    @GetMapping("/1")
    public Produit seulProduits(){
        return new Produit(55424L, "souri", 15.15,15);
    }

}