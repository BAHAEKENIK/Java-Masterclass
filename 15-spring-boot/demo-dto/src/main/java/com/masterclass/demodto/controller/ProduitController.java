package com.masterclass.demodto.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;
import com.masterclass.demodto.model.Produit;
import com.masterclass.demodto.service.ProduitService;
import com.masterclass.demodto.dto.ProduitRequest;
import com.masterclass.demodto.dto.ProduitResponse;
@RestController 
@RequestMapping("/api/produits")
public class ProduitController{
    private final ProduitService produitService;
    public ProduitController(ProduitService produitService){
        this.produitService = produitService;
    }
    @GetMapping
    public List<ProduitResponse> lister(){
        return produitService.lister();
    }
    @GetMapping("/{id}")
    public ProduitResponse trouverParId(@PathVariable Long id){
        return produitService.trouverParId(id);
    }
    @PostMapping
    public ProduitResponse creer(@RequestBody ProduitRequest produit){
        return produitService.creer(produit);
    }
    @DeleteMapping("/{id}")
    public String supprimer(@PathVariable Long id){
        return produitService.supprimer(id)?"supprimer":"pas trouver";
    }


}