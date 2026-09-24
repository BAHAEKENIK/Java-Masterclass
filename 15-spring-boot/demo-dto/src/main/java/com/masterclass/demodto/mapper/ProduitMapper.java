package com.masterclass.demodto.mapper;

import com.masterclass.demodto.dto.ProduitResponse;
import com.masterclass.demodto.dto.ProduitRequest;

import com.masterclass.demodto.model.Produit;

public class ProduitMapper{
    /**
     * Convert un Request DTO en Entity (avant suavgarde en BDD)
     * 
     */
    public static Produit toEntity(ProduitRequest request){
    Produit produit = new Produit();
    produit.setNom(request.getNom());
    produit.setPrix(request.getPrix());   // ✅ Ajouté
    produit.setStock(request.getStock()); // ✅ Ajouté
    return produit;
}
    /**
     * Convert Entity to Response DTO (avant envoi a client)
     */
    public static ProduitResponse toResponse(Produit produit){
        ProduitResponse produitResponse = new ProduitResponse();
        produitResponse.setId(produit.getId());
        produitResponse.setNom(produit.getNom());
        produitResponse.setPrix(produit.getPrix());
        produitResponse.setStock(produit.getStock());
        return produitResponse;
    }
}