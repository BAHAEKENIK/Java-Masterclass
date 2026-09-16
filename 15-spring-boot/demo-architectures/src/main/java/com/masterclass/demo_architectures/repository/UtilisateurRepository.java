package com.masterclass.demo_architectures.repository;

import com.masterclass.demo_architectures.model.Utilisateur;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository 
public class UtilisateurRepository{
    private final List<Utilisateur> utilisateurs = new ArrayList<>();
    public UtilisateurRepository(){
        utilisateurs.add(new Utilisateur(1L, "Alice","alice@mail.com",25));
        utilisateurs.add(new Utilisateur(2L, "Bob", "bob@mail.com",30));
        utilisateurs.add(new Utilisateur(3L, "Charlie","charlie@mail.com",28));
    }
    public List<Utilisateur> findAll(){
        
        return utilisateurs;
    }
    public Optional<Utilisateur> findById(Long id){
        Optional<Utilisateur> utilisateur = utilisateurs.stream()
        .filter(u -> u.getId().equals(id))
        .findFirst();
        if(!utilisateur.isEmpty()){
            return utilisateur;
        }
        return Optional.of(null);
    }
    public Utilisateur save(Utilisateur utilisateur){
        if(utilisateur.getId()==null){
            long nouveauId = utilisateurs.stream()
            .mapToLong(Utilisateur::getId)
            .max()
            .orElse(0)+1;
            utilisateur.setId(nouveauId);
        }
        utilisateurs.add(utilisateur);
        return utilisateur;
    }
    public boolean deleteById(Long id){
        return utilisateurs.removeIf(u->u.getId().equals(id));
    }
}