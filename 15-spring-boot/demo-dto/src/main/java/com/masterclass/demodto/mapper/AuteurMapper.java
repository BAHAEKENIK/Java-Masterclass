package com.masterclass.demodto.mapper;

import com.masterclass.demodto.dto.AuteurRequest;
import com.masterclass.demodto.dto.AuteurResponse;
import com.masterclass.demodto.model.Auteur;

public class AuteurMapper{
    /**
     * Convert DTO Request to Entity
     */
    public static Auteur toEntity(AuteurRequest request){
        Auteur auteur = new Auteur();
        auteur.setNom(request.getNom());
        auteur.setEmail(request.getEmail());
        return auteur;
    }
    /**
     * Convert Entity to DTO Response
     * 
     */
    public static AuteurResponse toResponse(Auteur auteur){
        AuteurResponse response = new AuteurResponse();
        response.setId(auteur.getId());
        response.setNom(auteur.getNom());
        response.setEmail(auteur.getEmail());
        return response;
    }
}