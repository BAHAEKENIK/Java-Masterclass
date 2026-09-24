package com.masterclass.demodto.controller;

import com.masterclass.demodto.dto.ArticleRequest;
import com.masterclass.demodto.dto.ArticleResponse;
import com.masterclass.demodto.service.ArticleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/articles")
public class ArticleController {

    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping
    public List<ArticleResponse> lister() {
        return articleService.listerTous();
    }

    @GetMapping("/{id}")
    public ArticleResponse getById(@PathVariable Long id) {
        return articleService.trouverParId(id);
    }

    @GetMapping("/auteur/{auteurId}")
    public List<ArticleResponse> getByAuteur(@PathVariable Long auteurId) {
        return articleService.trouverParAuteur(auteurId);
    }

    @PostMapping
    public ArticleResponse creer(@RequestBody ArticleRequest request) {
        return articleService.creer(request);
    }

    @DeleteMapping("/{id}")
    public String supprimer(@PathVariable Long id) {
        return articleService.supprimer(id) ? "Supprimé" : "Introuvable";
    }
}