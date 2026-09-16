package com.masterclass.demo_architectures.repository;

import com.masterclass.demo_architectures.model.Etudiant;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.ArrayList;
@Repository 
public class EtudiantRepository{
    private final List<Etudiant> etudiants = new ArrayList<>();
    public EtudiantRepository(){
        etudiants.add(new Etudiant(1L, "kenikssi", 15.00, "informatique"));
        etudiants.add(new Etudiant(2L, "khoumssi", 15.00,"reseau informatique"));
        etudiants.add(new Etudiant(3L, "drissi",17.00,"genie civil"));
    }
    public List<Etudiant> findAll(){
        return etudiants;
    }
    public Etudiant findById(Long id){
        return etudiants.stream()
        .filter(e -> e.getId().equals(id))
        .findFirst()
        .orElse(null);
    }
    public Etudiant save(Etudiant etudiant){
        if(etudiant.getId() == null){
            Long nouveauId = etudiants.stream()
            .mapToLong(Etudiant::getId)
            .max()
            .orElse(0)+1;
            etudiant.setId(nouveauId);
        }
        etudiants.add(etudiant);
        return etudiant;
    }
    public boolean deleteById(Long id){
        return etudiants.removeIf(e -> e.getId().equals(id));
    }
    
}