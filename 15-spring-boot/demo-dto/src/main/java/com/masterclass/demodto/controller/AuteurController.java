package com.masterclass.demodto.controller;

import com.masterclass.demodto.dto.AuteurRequest;
import com.masterclass.demodto.dto.AuteurResponse;
import com.masterclass.demodto.service.AuteurService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auteurs")
public class AuteurController {

    private final AuteurService auteurService;

    public AuteurController(AuteurService auteurService) {
        this.auteurService = auteurService;
    }

    @GetMapping
    public List<AuteurResponse> lister() {
        return auteurService.listerTous();
    }

    @GetMapping("/{id}")
    public AuteurResponse getById(@PathVariable Long id) {
        return auteurService.trouverParId(id);
    }

    @PostMapping
    public AuteurResponse creer(@RequestBody AuteurRequest request) {
        return auteurService.creer(request);
    }

    @DeleteMapping("/{id}")
    public String supprimer(@PathVariable Long id) {
        return auteurService.supprimer(id) ? "Supprimé" : "Introuvable";
    }
}