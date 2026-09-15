package com.masterclass.demo_CRUD.controller;

import com.masterclass.demo_CRUD.model.Utilisateur;
import java.util.List;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
@RestController

@RequestMapping("/api/utilisateurs")
public class UtilisateurController{
    public static List<Utilisateur> utilisateurs = new ArrayList<>();
    @GetMapping
    public List<Utilisateur> utilisateurs(){
        utilisateurs.add(new Utilisateur(76L, "kenikssi","bahaekenik@gmail.com",22));
        utilisateurs.add(new Utilisateur(77L, "khomssi","koumssi@gmail.com",70));
        utilisateurs.add(new Utilisateur(78L, "kenikssi","kenikssi@gmail.com",70));
        return utilisateurs;
    }
    @GetMapping("/{id}")
    public Utilisateur seulUtilisateur(@PathVariable Long id){
        return utilisateurs.stream()
            .filter(u->u.getId().equals(id))
            .findFirst()
            .orElse(null);
    }
    @PostMapping 
    public Utilisateur creerUtilisateur(@RequestBody Utilisateur utilisateur){
        utilisateurs.add(utilisateur);
        return utilisateur;
    }
    @DeleteMapping("/{id}")
    public String supprimerUtilisateur(@PathVariable Long id){
        utilisateurs.removeIf(u->u.getId().equals(id));
        return "Utilisateur : "+id+" supprimer";
    }
}