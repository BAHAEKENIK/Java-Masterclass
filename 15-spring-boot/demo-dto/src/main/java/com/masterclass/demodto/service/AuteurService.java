package com.masterclass.demodto.service;

import com.masterclass.demodto.dto.AuteurRequest;
import com.masterclass.demodto.dto.AuteurResponse;
import com.masterclass.demodto.mapper.AuteurMapper;
import com.masterclass.demodto.model.Auteur;
import com.masterclass.demodto.repository.AuteurRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service 
public class AuteurService{
    private final AuteurRepository auteurRepository;

    public AuteurService(AuteurRepository auteurRepository){
        this.auteurRepository = auteurRepository;
    }
    public AuteurResponse creer(AuteurRequest request){
        Auteur auteur = AuteurMapper.toEntity(request);
        Auteur saved = auteurRepository.save(auteur);
        return AuteurMapper.toResponse(saved);
    }
    public List<AuteurResponse> listerTous(){
        return auteurRepository.findAll()
        .stream()
        .map(AuteurMapper::toResponse)
        .collect(Collectors.toList());
    }
    public AuteurResponse trouverParId(Long id){
        Auteur auteur = auteurRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Auteur introuvable : " + id));
        return AuteurMapper.toResponse(auteur);
    }
    public boolean supprimer(Long id){
        if(auteurRepository.existsById(id)){
            auteurRepository.deleteById(id);
            return true;
        }
        return false;
    }
}