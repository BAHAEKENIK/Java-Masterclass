package com.masterclass.demoapi.controller;

import com.masterclass.demoapi.model.Etudiant;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/etudiants")
public class EtudiantController {

    // ✅ Liste en attribut de classe (partagée entre méthodes)
    private final List<Etudiant> etudiants = new ArrayList<>();

    public EtudiantController() {
        etudiants.add(new Etudiant(65567L, "kenikssi", 15.00, "informatique"));
        etudiants.add(new Etudiant(7567L, "fatime", 17.00, "reseau informatique"));
        etudiants.add(new Etudiant(84765L, "alae", 18.00, "topographie"));
    }

    @GetMapping
    public List<Etudiant> listerEtudiant() {
        return etudiants;
    }

    @GetMapping("/{id}")
    public Optional<Etudiant> seulEtudiant(@PathVariable Long id) {
        return etudiants.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst();
    }
}