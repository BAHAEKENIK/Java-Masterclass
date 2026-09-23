package com.masterclass.demo_jpa.service;
import com.masterclass.demo_jpa.model.Auteur;
import java.time.LocalDate;
import com.masterclass.demo_jpa.repository.AuteurRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import com.masterclass.demo_jpa.model.Article;
import com.masterclass.demo_jpa.repository.ArticleRepository;
import com.masterclass.demo_jpa.repository.ArticleRepository;
@Service

public class ArticleService{
    private final ArticleRepository articleRepository;
    private final AuteurRepository auteurRepository;

    public ArticleService(ArticleRepository articleRepository, AuteurRepository auteurRepository){
        this.articleRepository = articleRepository;
        this.auteurRepository = auteurRepository;
    }
    public Article enregisterArticle(String nomArticle, Long auteurId){
        Auteur auteur = auteurRepository.findById(auteurId)
        .orElseThrow(() -> new RuntimeException("Auteur introvable avec l'id : "+ auteurId));

        Article article = new Article();
        article.setNom(nomArticle);
        article.setAuteur(auteur);
        article.setDatePublication(LocalDate.now());
        return articleRepository.save(article);
    }
    public List<Article> listerTous(){
        return articleRepository.findAll();
    }
}