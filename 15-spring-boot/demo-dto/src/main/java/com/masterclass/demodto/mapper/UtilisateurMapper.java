package com.masterclass.demodto.mapper;

import com.masterclass.demodto.dto.UtilisateurRequest;
import com.masterclass.demodto.dto.UtilisateurResponse;
import com.masterclass.demodto.model.Utilisateur;

public class UtilisateurMapper{
    /**
     * Convertit un Request DTO en Entity (avant sauvgarde en BDD).\
     * 
     */
    public static Utilisateur toEntity(UtilisateurRequest request){
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom(request.getNom());
        utilisateur.setEmail(request.getEmail());
        utilisateur.setMotDePasse(request.getMotDePasse()); //  en Vrai : hasher
        return utilisateur;
    }
    /**
     * Convertit une Entity en Response DTO (avant envoi au client)
     * 
     */
    public static UtilisateurResponse toResponse(Utilisateur utilisateur){
        UtilisateurResponse response = new UtilisateurResponse();
        response.setId(utilisateur.getId());
        response.setNom(utilisateur.getNom());
        response.setEmail(utilisateur.getEmail());
        response.setCreatedAt(utilisateur.getCreatedAt());
        return response;
    }
}