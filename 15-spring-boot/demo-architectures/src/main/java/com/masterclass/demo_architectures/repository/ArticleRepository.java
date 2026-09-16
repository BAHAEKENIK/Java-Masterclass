package com.masterclass.demo_architectures.repository;

import org.springframework.stereotype.Repository;
import com.masterclass.demo_architectures.model.Article;

import java.util.List;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.util.ArrayList;
@Repository 
public class ArticleRepository{
    private final List<Article> articles = new ArrayList<>();
    public ArticleRepository(){
        articles.add(new Article(1L, "Introduction à Spring Boot", "Contenu de l'article 1...", "Alice", LocalDate.of(2026, 5, 12)));
    articles.add(new Article(2L, "Maîtriser les Streams Java", "Contenu de l'article 2...", "Bob", LocalDate.of(2026, 8, 20)));
    articles.add(new Article(3L, "Nouveautés Java 25", "Contenu de l'article 3...", "Charlie", LocalDate.now()));
    }
    
    public List<Article> findAll(){
        return articles;
    }
    public List<Article> findByAuteur(String auteur){
        return articles.stream()
        .filter(a->a.getAuteur().equals(auteur))
        .collect(Collectors.toList());
    }
    public Article save(Article article){
        if(article.getId()==null){
            Long nouveauArticle = articles.stream().mapToLong(Article::getId).max().orElse(0)+1;
            article.setId(nouveauArticle);
        }
        articles.add(article);
        return article;
    }
    public boolean deleteById(Long id){
        return articles.removeIf(a->a.getId().equals(id));
    }
}