package com.masterclass.demo_jpa.repository;

import com.masterclass.demo_jpa.model.Article;

import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;
public interface ArticleRepository extends JpaRepository<Article, Long>{
}