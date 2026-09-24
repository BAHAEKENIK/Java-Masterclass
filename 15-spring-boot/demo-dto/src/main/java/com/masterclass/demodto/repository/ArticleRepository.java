package com.masterclass.demodto.repository;

import com.masterclass.demodto.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long>{
    
}