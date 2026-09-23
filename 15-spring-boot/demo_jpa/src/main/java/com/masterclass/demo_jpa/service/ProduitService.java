package com.masterclass.demo_jpa.service;

import org.springframework.stereotype.Service;
import com.masterclass.demo_jpa.repository.ProduitRepository;
import java.util.List;
import com.masterclass.demo_jpa.model.Produit;
@Service
public class ProduitService{
    private final ProduitRepository produitRepository;

    public ProduitService(ProduitRepository produitRepository){
        this.produitRepository = produitRepository;
    }
    public Produit creer(Produit produit){
        return produitRepository.save(produit);
    }
    public List<Produit> listerProduits(){
        return produitRepository.findAll();
    }
    public List<Produit> chercheParNom(String nom){
        return produitRepository.findByNomContaining(nom);
    }
}