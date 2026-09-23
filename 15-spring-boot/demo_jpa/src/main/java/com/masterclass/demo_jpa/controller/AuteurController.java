package com.masterclass.demo_jpa.controller;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import com.masterclass.demo_jpa.model.Auteur;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.masterclass.demo_jpa.service.AuteurService;
@RestController 
@RequestMapping("/api/auteurs")
public class AuteurController{
    private final AuteurService auteurService;
    public AuteurController(AuteurService auteurService){
        this.auteurService = auteurService;
    }
    @PostMapping
    public Auteur creer(@RequestBody Auteur auteur){
        return auteurService.creerAuteur(auteur);
    }
    @GetMapping
    public List<Auteur> lister(){
        return auteurService.listerTous();
    }
}