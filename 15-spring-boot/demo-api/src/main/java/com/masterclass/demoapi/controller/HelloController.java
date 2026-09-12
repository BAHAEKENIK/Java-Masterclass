package com.masterclass.demoapi.controller;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
@RestController 
public class HelloController{
    @GetMapping("/hello/{nom}")
    public String direBonjourAvecNom(@PathVariable String nom){
        return "Bonjour " + nom +" !";
    }
}
