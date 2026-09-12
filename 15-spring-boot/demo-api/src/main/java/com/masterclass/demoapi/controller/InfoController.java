package com.masterclass.demoapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class InfoController{
    @GetMapping("/info")
    public String ditInformation(){
        return "Ceci est une API creer par Bahae";
    }
}