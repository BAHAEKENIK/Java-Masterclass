package com.masterclass.demo_architectures.service;

import com.masterclass.demo_architectures.model.Article;
import com.masterclass.demo_architectures.repository.ArticleRepository;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ArticleService{
    private final ArticleRepository articleRepository;
    public ArticleService(ArticleRepository articleRepository){
        this.articleRepository = articleRepository;
    }
    public List<Article> listerUtilisateur(){
        return articleRepository.findAll();
    }
    public List<Article> chercherParAuteur(String auteur){
        return articleRepository.findByAuteur(auteur);
    }
    public Article ajouterArticle(Article article){
        return articleRepository.save(article);
    }
    public boolean supprimerArticle(Long id){
        return articleRepository.deleteById(id);
    }
}