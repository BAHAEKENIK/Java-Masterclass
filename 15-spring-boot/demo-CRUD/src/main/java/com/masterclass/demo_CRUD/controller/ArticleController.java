package com.masterclass.demo_CRUD.controller;

import com.masterclass.demo_CRUD.model.Article;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
@RestController 
@RequestMapping("/api/articles")
public class ArticleController{
    private List<Article> articles = new ArrayList<>();
    @GetMapping 
    public List<Article> listeArticle(){
        articles.add(new Article(1L, "boite a merveille", "sidi mohamed", "mohamed sfrioui", LocalDate.of(2026,12,15)));
        articles.add(new Article(2L, "antigon", "teater kill", "i dont know ", LocalDate.of(2026,10,25)));
        articles.add(new Article(3L, "i dont know", "i dont know", "i dont know", LocalDate.of(2026,15,14)));
        return articles;
    }
    @GetMapping("/{id}")
    public Article seulArticle(@PathVariable Long id){
        return articles.stream()
        .filter(a -> a.getId().equals(id))
        .findFirst()
        .orElse(null);
    }
    @PostMapping
    public Article creerArticle(@RequestBody Article article){
        if(article.getId() == null){
            long nouveauId = articles.stream().mapToLong(Article::getId).max().orElse(0)+1;
            article.setId(nouveauId);
        }
        articles.add(article);
        return article;
    }
    @DeleteMapping("/{id}")
    public String supprimerArticle(@PathVariable Long id){
        articles.removeIf(a -> a.getId().equals(id));
        return "Article "+ id +" a  bien supprimer";
    }
    @PutMapping("/{id}")
    public Article modifierArticle(@PathVariable Long id, @RequestBody Article articlemodifier){
        for(int i = 0; i<articles.size();i++){
            if(articles.get(i).getId().equals(id)){
                articlemodifier.setId(id);
                articles.set(i, articlemodifier);
                return articlemodifier;
            }
        }
        return null;
    }
}