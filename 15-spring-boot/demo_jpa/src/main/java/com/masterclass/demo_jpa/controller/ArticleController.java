package com.masterclass.demo_jpa.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import com.masterclass.demo_jpa.model.Article;
import com.masterclass.demo_jpa.service.ArticleService;
import com.masterclass.demo_jpa.model.Auteur;
import java.util.List;
@RestController 
@RequestMapping("/api/articles")
public class ArticleController{
    private final ArticleService articleService;

    public ArticleController(ArticleService articleService){
        this.articleService = articleService;
    }
    @PostMapping
    public Article creer(@RequestParam String nom, @RequestParam Long auteurId){
        return articleService.enregisterArticle(nom, auteurId);
    }
    @GetMapping
    public List<Article> lister(){
        return articleService.listerTous();
    }
}