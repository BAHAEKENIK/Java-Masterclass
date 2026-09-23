package com.masterclass.demo_jpa.repository;

import com.masterclass.demo_jpa.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long>{

}