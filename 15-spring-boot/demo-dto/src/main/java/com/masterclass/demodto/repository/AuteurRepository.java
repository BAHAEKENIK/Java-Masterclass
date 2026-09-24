package com.masterclass.demodto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masterclass.demodto.model.Auteur;
import java.util.Optional;
public interface AuteurRepository extends JpaRepository<Auteur, Long>{
    Optional<Auteur> findByEmail(String email);
}