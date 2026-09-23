package com.masterclass.demo_jpa.service;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.masterclass.demo_jpa.model.Utilisateur;
import com.masterclass.demo_jpa.repository.UtilisateurRepository;
@Service 
public class UtilisateurService{
    private final UtilisateurRepository utilisateurRepository;

    public UtilisateurService(UtilisateurRepository utilisateurRepository){
        this.utilisateurRepository = utilisateurRepository;
    }
    public List<Utilisateur> listerTous() {
        return utilisateurRepository.findAll();
    }
    public Optional<Utilisateur> trouverParId(Long id){
        return utilisateurRepository.findById(id);
    }
    public Utilisateur creer(Utilisateur utilisateur){
        return utilisateurRepository.save(utilisateur);
    }
    public boolean supprimer(Long id){
        if(utilisateurRepository.existsById(id)){
            utilisateurRepository.deleteById(id);
            return true;
        }
        return false;
    }

}