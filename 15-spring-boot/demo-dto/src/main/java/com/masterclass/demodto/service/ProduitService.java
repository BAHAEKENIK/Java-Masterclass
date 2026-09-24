package com.masterclass.demodto.service;
import com.masterclass.demodto.mapper.ProduitMapper;
import com.masterclass.demodto.model.Produit;
import com.masterclass.demodto.dto.ProduitRequest;
import com.masterclass.demodto.dto.ProduitResponse;
import com.masterclass.demodto.repository.ProduitRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;
@Service 
public class ProduitService{
    private final ProduitRepository produitRepository;

    public ProduitService(ProduitRepository produitRepository){
        this.produitRepository = produitRepository;
    }
    public ProduitResponse creer(ProduitRequest request){
        // Convertir DTO -> Entity
        Produit produit = ProduitMapper.toEntity(request);

        // 2. logique metier(validation, hash mot de passe, etc.)
        if(produit.getNom()==null || produit.getNom().isEmpty()){
            throw new IllegalArgumentException("Le nom ne peut pas etre valide");
        }

        // 3. Sauvgarder en base 
        Produit saved = produitRepository.save(produit);
        // 4. Convertir Entity -> Response DTO
        return ProduitMapper.toResponse(saved);
        
    }
    /**
     * Liste tous les produits (sous forme de Response DTO).
     * 
     */
    public List<ProduitResponse> lister(){
        return produitRepository.findAll()
        .stream()
        .map(ProduitMapper::toResponse)
        .collect(Collectors.toList());
    }
    /**
     * Trouver un produit pas ID;
     */
    public ProduitResponse trouverParId(Long id){
        Produit produit = produitRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("produit introvable : "+ id));
        return ProduitMapper.toResponse(produit);
    }
    /**
     * Supprime un produit
     */
    public boolean supprimer(Long id){
        if(produitRepository.existsById(id)){
            produitRepository.deleteById(id);
            return true;
        }
        return false;
    }
}