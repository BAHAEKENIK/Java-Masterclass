package com.masterclass.demo_architectures.service;

import org.springframework.stereotype.Service;
import com.masterclass.demo_architectures.model.Utilisateur;
import com.masterclass.demo_architectures.repository.UtilisateurRepository;
import java.util.List;
import java.util.Optional;
@Service 
public class UtilisateurService{
    private final UtilisateurRepository utilisateurRepository;
    public UtilisateurService(UtilisateurRepository utilisateurRepository){
        this.utilisateurRepository = utilisateurRepository;
    }
    public List<Utilisateur> listerTous(){
        return utilisateurRepository.findAll();
    } 
    public Optional<Utilisateur> trouverParId(Long id){
        return utilisateurRepository.findById(id);
    }
    public Utilisateur creerUtilisateur(Utilisateur utilisateur){
        if(utilisateur.getNom() == null || utilisateur.getNom().isEmpty()){
            throw new IllegalArgumentException("le nom ne peut pas etre vide");
        }
        return utilisateurRepository.save(utilisateur);
    }
    public boolean supprimer(Long id) {
    return utilisateurRepository.deleteById(id);
}
}