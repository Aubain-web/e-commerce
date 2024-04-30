package com.ecommerce.projet.repository;


import com.ecommerce.projet.entity.CategorieProduit;
import com.ecommerce.projet.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProduitRepository  extends JpaRepository<Produit, Long> {

    @Override
    List<Produit> findAll();

    List<Produit> findByCategorieProduitId(Long idCategorie);
}
