package com.masterclass.demoapi.controller;

import com.masterclass.demoapi.model.Utilisateur;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController 
@RequestMapping("/api/utilisateurs")
public class UtilisateurController{
    @GetMapping
    public List<Utilisateur> listerUtilisateurs(){
        List<Utilisateur> utilisateurs = new ArrayList<>();
        utilisateurs.add(new Utilisateur(1L, "Alice","aluce@mail.com", 25));
        utilisateurs.add(new Utilisateur(2L,"Bob","bob@mail.com",30));
        utilisateurs.add(new Utilisateur(3L, "Charlie", "charlie@mail.com", 28));
        return utilisateurs;
    }
    @GetMapping("/1")
    public Utilisateur getPremierUtilisateur(){
        return new Utilisateur(1L,"Alice","alice@mail.com", 25);
    }
}