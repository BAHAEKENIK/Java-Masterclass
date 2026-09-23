package com.masterclass.demo_jpa.service;
import com.masterclass.demo_jpa.model.Utilisateur;
import com.masterclass.demo_jpa.repository.UtilisateurRepository;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
@Service
public class UtilisateurService{
    private final UtilisateurRepository utilisateurRepository;
    public UtilisateurService(UtilisateurRepository utilisateurRepository){
        this.utilisateurRepository = utilisateurRepository;
    }
    public Utilisateur creer(Utilisateur utilisateur){
        return utilisateurRepository.save(utilisateur);
    }

}