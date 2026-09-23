package com.masterclass.demo_jpa.controller;

import com.masterclass.demo_jpa.model.Produit;
import com.masterclass.demo_jpa.service.ProduitService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
@RestController
@RequestMapping("/api/produits")
public class ProduitController{
    private final ProduitService produitService;
    public ProduitController(ProduitService produitService){
        this.produitService = produitService;
    }
    @PostMapping("/creer")
    public Produit creerProduit(@RequestBody Produit produit){
        return produitService.creer(produit);
    }
    @GetMapping("/listerProduit")
    public List<Produit> listerproduit(){
        return produitService.listerProduits();
    }
    @GetMapping("/{nom}")
    public List<Produit> chercherProduits(@PathVariable String nom){
        return produitService.chercheParNom(nom);
    }

}