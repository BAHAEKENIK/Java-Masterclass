package com.masterclass.demo_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.masterclass.demo_jpa.model.Auteur;

import java.util.List;
import java.util.Optional;
import java.time.LocalDate;


public interface AuteurRepository extends JpaRepository<Auteur, Long>{
    
}