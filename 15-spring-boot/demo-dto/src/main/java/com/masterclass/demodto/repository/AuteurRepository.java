package com.masterclass.demodto.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.masterclass.demodto.model.Auteur;
import org.springframework.stereotype.Repository;

public interface AuteurRepository extends JpaRepository<Auteur, Long>{

}