package com.masterclass.demoapi.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController 
public class SommeController{
    @GetMapping("/calcul/{a}/{b}")
    public String somme(@PathVariable int a, @PathVariable int b){
        return "La somme de ["+a+"], et ["+b+"], est ["+(a+b)+"]"; 
    }
}