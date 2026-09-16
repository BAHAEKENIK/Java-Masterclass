package com.masterclass.demo_architectures.controller;

import com.masterclass.demo_architectures.model.Utilisateur;
import com.masterclass.demo_architectures.service.UtilisateurService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/utilisateurs")
public class UtilisateurController {

    private final UtilisateurService utilisateurService;

    public UtilisateurController(UtilisateurService utilisateurService) {
        this.utilisateurService = utilisateurService;
    }

    @GetMapping
    public List<Utilisateur> lister() {
        return utilisateurService.listerTous();
    }

    @GetMapping("/{id}")
    public Utilisateur getById(@PathVariable Long id) {
        return utilisateurService.trouverParId(id).orElse(null);
    }

    @PostMapping
    public Utilisateur creer(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.creerUtilisateur(utilisateur);
    }

    @DeleteMapping("/{id}")
    public String supprimer(@PathVariable Long id) {
        return utilisateurService.supprimer(id) ? "Supprimé" : "Introuvable";
    }
}