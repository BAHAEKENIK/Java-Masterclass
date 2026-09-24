package com.masterclass.demodto.service;

import com.masterclass.demodto.dto.ArticleRequest;
import com.masterclass.demodto.dto.ArticleResponse;
import com.masterclass.demodto.mapper.ArticleMapper;
import com.masterclass.demodto.model.Article;
import com.masterclass.demodto.model.Auteur;
import com.masterclass.demodto.repository.ArticleRepository;
import com.masterclass.demodto.repository.AuteurRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service 
public class ArticleService{
    private final ArticleRepository articleRepository;
    private final AuteurRepository auteurRepository;

    public ArticleService(ArticleRepository articleRepository, AuteurRepository auteurRepository){
        this.auteurRepository = auteurRepository;
        this.articleRepository = articleRepository;
    }

    /**
     * Creer un article lie a un auteur
     */
    public ArticleResponse creer(ArticleRequest request) {
        // 1. Vérifier que l'auteur existe
        Auteur auteur = auteurRepository.findById(request.getAuteurId())
                .orElseThrow(() -> new RuntimeException("Auteur introuvable : " + request.getAuteurId()));

        // 2. Convertir Request → Entity
        Article article = ArticleMapper.toEntity(request);

        // 3. Associer l'auteur et la date
        article.setAuteur(auteur);
        article.setDatePublication(LocalDate.now());

        // 4. Sauvegarder
        Article saved = articleRepository.save(article);

        // 5. Convertir Entity → Response
        return ArticleMapper.toResponse(saved);
    }
    public List<ArticleResponse> listerTous(){
        return articleRepository.findAll()
        .stream()
        .map(ArticleMapper::toResponse)
        .collect(Collectors.toList());
    }
    public ArticleResponse trouverParId(Long id){
        Article article = articleRepository.findById(id)
        .orElseThrow(()->new RuntimeException("Article introuvable : " + id));
        return ArticleMapper.toResponse(article);
    }
    /**
     * Trouver tous les articles d'un auteur donner
     * 
     */
    public List<ArticleResponse> trouverParAuteur(Long auteurId){
        return articleRepository.findByAuteurId(auteurId)
        .stream()
        .map(ArticleMapper::toResponse)
        .collect(Collectors.toList());
    }
    /**
     * 
     */
    public boolean supprimer(Long id){
        if(articleRepository.existsById(id)){
            articleRepository.deleteById(id);
            return true;
        }
        return false;
    }

}