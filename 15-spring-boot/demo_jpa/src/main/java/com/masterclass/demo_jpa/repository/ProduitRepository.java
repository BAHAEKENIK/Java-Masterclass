package com.masterclass.demo_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masterclass.demo_jpa.model.Produit;
import java.util.List;
import java.util.Optional;
public interface ProduitRepository extends JpaRepository<Produit, Long>{
    List<Produit> findByNomContaining(String nom);
}