package com.masterclass.demo_architectures.service;

import org.springframework.stereotype.Service;
import com.masterclass.demo_architectures.repository.EtudiantRepository;
import com.masterclass.demo_architectures.model.Etudiant;
import java.util.ArrayList;
import java.util.Optional;
import java.util.List;

@Service
public class EtudiantService{
    private final EtudiantRepository etudiantRepository;
    public EtudiantService(EtudiantRepository etudiantRepository){
        this.etudiantRepository = etudiantRepository;
    }
    public boolean supprimer(Long id){
        return etudiantRepository.deleteById(id);
    }
}