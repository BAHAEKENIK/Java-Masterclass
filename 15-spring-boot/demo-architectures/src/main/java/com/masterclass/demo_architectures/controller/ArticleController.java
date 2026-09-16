package com.masterclass.demo_architectures.controller;

import org.springframework.web.bind.annotation.RestController;
import com.masterclass.demo_architectures.service.ArticleService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.masterclass.demo_architectures.service.ArticleService;
import java.util.List;
@RestController 
@RequestMapping("/api/Aricle")
public class ArticleController{
    private final ArticleService articleService;
    public ArticleController(ArticleService articleService){
        this.articleService = articleService;
    } 
    
}