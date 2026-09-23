package com.masterclass.demo_jpa.repository;

import com.masterclass.demo_jpa.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.List;
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    // Toutes les méthodes CRUD sont déjà fournies :
    // save(), findAll(), findById(), deleteById(), count()...
    List<Utilisateur> findByNom(String nom);
    List<Utilisateur> findByAgeGreaterThan(int age);

    Optional<Utilisateur> findByEmail(String email);
    Utilisateur save(Utilisateur utilisateur);
}