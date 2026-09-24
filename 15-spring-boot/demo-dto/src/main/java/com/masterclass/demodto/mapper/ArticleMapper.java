package com.masterclass.demodto.mapper;
import com.masterclass.demodto.dto.ArticleRequest;
import com.masterclass.demodto.dto.ArticleResponse;
import com.masterclass.demodto.model.Article;

public class ArticleMapper{
    public static Article toEntity(ArticleRequest request){
        Article article = new Article();
        article.setTitre(request.getTitre());
        article.setContenu(request.getContenu());

        return article;
    }
    public static ArticleResponse toResponse(Article article){
        ArticleResponse response = new ArticleResponse();
        response.setId(article.getId());
        response.setTitre(article.getTitre());
        response.setContenu(article.getContenu());
        response.setDatePublication(article.getDatePublication());
         if(article.getAuteur()!=null){
            response.setNomAuteur(article.getAuteur().getNom());
         }
        return response;
    }
}