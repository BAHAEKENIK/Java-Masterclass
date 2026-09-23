package com.masterclass.demo_jpa.controller;
import com.masterclass.demo_jpa.model.Utilisateur;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.masterclass.demo_jpa.repository.UtilisateurRepository;
import com.masterclass.demo_jpa.service.UtilisateurService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
@RestController 
@RequestMapping ("/api/utilisateurs")
public class UtilisateurController{
    private final UtilisateurService utilisateurService;

    public UtilisateurController(UtilisateurService utilisateurService){
        this.utilisateurService = utilisateurService;
    }
    @PostMapping("/creer")
    public Utilisateur creerUtilisateur(@RequestBody Utilisateur utilisateur){
        return utilisateurService.creer(utilisateur);
    }
}