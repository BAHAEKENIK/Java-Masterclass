package com.masterclass.demoapi.controller;

import com.masterclass.demoapi.model.Article;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/articles")
public class ArticleController {

    private final List<Article> articles = new ArrayList<>();

    public ArticleController() {
        articles.add(new Article(987L, "article1", "contenu1", "auteur1", LocalDate.of(2026, 9, 12)));
        articles.add(new Article(123L, "article2", "contenu2", "auteur2", LocalDate.of(2026, 9, 13)));
        articles.add(new Article(567L, "article3", "contenu3", "auteur3", LocalDate.of(2026, 9, 14)));
    }

    @GetMapping
    public List<Article> listerArticles() {
        return articles;
    }

    @GetMapping("/{id}")
    public Optional<Article> articleParId(@PathVariable Long id) {
        return articles.stream()
                .filter(a -> a.getId().equals(id))
                .findFirst();
    }
}