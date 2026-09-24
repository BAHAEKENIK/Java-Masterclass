package com.masterclass.demodto.controller;

import com.masterclass.demodto.dto.UtilisateurRequest;
import com.masterclass.demodto.dto.UtilisateurResponse;
import com.masterclass.demodto.service.UtilisateurService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController 
@RequestMapping("/api/utilisateurs")
public class UtilisateurController{
    private final UtilisateurService utilisateurService;

    public UtilisateurController(UtilisateurService utilisateurService){
        this.utilisateurService = utilisateurService;
    }
    // GET /api/utilisateurs
    @GetMapping
    public List<UtilisateurResponse> lister(){
        return utilisateurService.listerTous();
    }


    @GetMapping("/{id}")
    public UtilisateurResponse getById(@PathVariable Long id){
        return utilisateurService.trouverParId(id);
    }

    // POST /api/utilisateurs
    @PostMapping
    public UtilisateurResponse creer(@RequestBody UtilisateurRequest request){
        return utilisateurService.creer(request);
    }

    // DELETE /api/utilisateurs/{id}
    @DeleteMapping("{id}")
    public String supprimer(@PathVariable Long id){
        return utilisateurService.supprimer(id) ? "Supprime" : "introuvable";
    }
}

