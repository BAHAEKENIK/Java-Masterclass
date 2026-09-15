package com.masterclass.demo_CRUD.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.masterclass.demo_CRUD.model.Etudiant;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.ArrayList;
import java.util.List;
@RestController 
@RequestMapping("/api/etudiants")
public class EtudiantController{
    private static List<Etudiant> etudiants = new ArrayList<>();
    @GetMapping 
    public List<Etudiant> listeEtudiant(){
        etudiants.add(new Etudiant(1L,"bahae",15.00,"informatique"));
        etudiants.add(new Etudiant(2L,"mohamed",17.00,"base de donnes"));
        etudiants.add(new Etudiant(3L, "douae",17.00,"industry"));
        return etudiants;
    }
    @GetMapping("/{id}")
    public Etudiant unEtudiant(@PathVariable Long id){
        return etudiants.stream()
            .filter(u->u.getId().equals(id))
            .findFirst()
            .orElse(null);
    }
    @PostMapping 
    public Etudiant creerEtudiant(@RequestBody Etudiant etudiant){
        etudiants.add(etudiant);
        return etudiant;
    }
    @PutMapping("/{id}")
    public Etudiant modifierEtudiant(@PathVariable Long id, @RequestBody Etudiant etudiantModifie){
        for(int i = 0; i<etudiants.size();i++){
            if(etudiants.get(i).getId().equals(id)){
                etudiantModifie.setId(id);
                etudiants.set(i, etudiantModifie);
                return etudiantModifie;
            }
        }
        return null;
    }
    

}