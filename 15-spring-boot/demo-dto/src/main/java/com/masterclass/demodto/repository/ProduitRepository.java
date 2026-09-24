package com.masterclass.demodto.repository;
import com.masterclass.demodto.dto.ProduitRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import com.masterclass.demodto.dto.ProduitResponse;
import com.masterclass.demodto.model.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>{

}