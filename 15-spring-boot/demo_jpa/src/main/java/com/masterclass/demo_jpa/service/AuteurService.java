package com.masterclass.demo_jpa.service;

import com.masterclass.demo_jpa.repository.AuteurRepository;
import org.springframework.stereotype.Service;
import com.masterclass.demo_jpa.model.Auteur;
import java.util.List;
@Service 
public class AuteurService{
    private final AuteurRepository auteurRepository;
    public AuteurService(AuteurRepository auteurRepository){
        this.auteurRepository = auteurRepository;
    }
    public Auteur creerAuteur(Auteur auteur){
        return auteurRepository.save(auteur);
    }
    public List<Auteur> listerTous(){
        return auteurRepository.findAll();
    }
}