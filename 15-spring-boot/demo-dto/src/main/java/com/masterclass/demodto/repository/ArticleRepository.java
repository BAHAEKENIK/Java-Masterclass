package com.masterclass.demodto.repository;

import com.masterclass.demodto.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ArticleRepository extends JpaRepository<Article, Long>{
    // Trouver tous les articles d'un auteur donne
    List<Article> findByAuteurId(Long auteurId);
}