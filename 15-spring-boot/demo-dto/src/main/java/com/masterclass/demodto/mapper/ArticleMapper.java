package com.masterclass.demodto.mapper;
import com.masterclass.demodto.dto.ArticleRequest;
import com.masterclass.demodto.dto.ArticleResponse;
import com.masterclass.demodto.model.Article;
import com.masterclass.demodto.model.Auteur;
public class ArticleMapper{
    /**
     * Convert DTO Request to Entity (avant save en DBB)
     * 
     */
    public static Article toEntity(ArticleRequest request){
        Article article = new Article();
        article.setNom(request.getNom());
        Auteur auteur = new Auteur();
        article.setAuteur(auteur.getId() == request.getAuteurId()? auteur : null);
        return article;
    }
    /**
     * Convert Entity to DTO reponse (avant send to client)
     */
    public static ArticleResponse toResponse(Article article){
        ArticleResponse dto = new ArticleResponse();
        dto.setId(article.getId());
        dto.setNom(article.getNom());
        dto.setDatePublication(article.getDatePublication());
        dto.setNomAuteur(article.getAuteur().getNom());
        return dto;
    }
}