package com.masterclass.demodto.service;

import com.masterclass.demodto.dto.UtilisateurRequest;
import com.masterclass.demodto.dto.UtilisateurResponse;
import com.masterclass.demodto.mapper.UtilisateurMapper;
import com.masterclass.demodto.model.Utilisateur;
import com.masterclass.demodto.repository.UtilisateurRepository;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service 
public class UtilisateurService{
    private final UtilisateurRepository utilisateurRepository;

    public UtilisateurService(UtilisateurRepository utilisateurRepository){
        this.utilisateurRepository = utilisateurRepository;
    }
    /**
     * Cree un utilisateur a partir d'un request DTO.
     * Routourne un response dto;
     */
    public UtilisateurResponse creer(UtilisateurRequest request){
        // 1. Convertit Request DTO -> Entity
        Utilisateur utilisateur = UtilisateurMapper.toEntity(request);
        // 2. Logique metier (validation, hash mot de passe, etc.)
        if(utilisateur.getNom() == null || utilisateur.getNom().isEmpty()){
            throw new IllegalArgumentException("Le nom ne peut pas etre vide");
        }

        //3. Sauvgarde en base 
        Utilisateur saved = utilisateurRepository.save(utilisateur);

        //4. Convertir Entity -> Response DTO
        return UtilisateurMapper.toResponse(saved);
    }

    /**
     * Liste tous les utilisateurs (sous forme de Response DTO).
     * 
     */
    public List<UtilisateurResponse> listerTous(){
        return utilisateurRepository.findAll()
        .stream()
        .map(UtilisateurMapper::toResponse)
        .collect(Collectors.toList());
    }

    /**
     * Trouve un utilisateur par ID.
     */
    public UtilisateurResponse trouverParId(Long id) {
        Utilisateur utilisateur = utilisateurRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Utilisateur introuvable : " + id));
        return UtilisateurMapper.toResponse(utilisateur);
    }

    /**
     * Supprime un utilisateur 
     */
    public boolean supprimer(Long id){
        if(utilisateurRepository.existsById(id)){
            utilisateurRepository.deleteById(id);
            return true;
        }
        return false;
    }
}