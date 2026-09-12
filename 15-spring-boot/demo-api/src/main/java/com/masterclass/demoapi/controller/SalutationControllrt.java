package com.masterclass.demoapi.controller;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
public class SalutationControllrt{
    @GetMapping("/salutation/{prenom}/{age}")
    public String salutation(@PathVariable String prenom , @PathVariable int age){
        return "Bonjour ["+prenom+"], tu as ["+age+"] ans";
    }
}