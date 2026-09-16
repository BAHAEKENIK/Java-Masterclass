package com.masterclass.demo_architectures.controller;

import org.springframework.web.bind.annotation.RestController;
import com.masterclass.demo_architectures.service.EtudiantService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController 
@RequestMapping("/api/etudiants")
public class EtudiantController{
    private final EtudiantService etudiantService;
    public EtudiantController(EtudiantService etudiantService){
        this.etudiantService = etudiantService;
    }
    @DeleteMapping("/{id}")
    public String supprimerEtudiant(@PathVariable Long id){
        return etudiantService.supprimer(id) ? "supprimer succes": "suprime echoue";
    }
}