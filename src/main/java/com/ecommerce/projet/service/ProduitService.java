package com.ecommerce.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.projet.dto.ProduitDto;
import com.ecommerce.projet.entity.Produit;
import com.ecommerce.projet.repository.ProduitRepository;

@Service
public class ProduitService {

    @Autowired
    private ProduitRepository produitRepository;

    public List<Produit> getAll(){
        return produitRepository.findAll();
    }

    public Produit getById(final Long idProduit) {
        return produitRepository.findById(idProduit).orElse(null);
    }

    public boolean deleteById(final Long idProduit) {
        boolean reponse = false;

        try {
            if(produitRepository.existsById(idProduit)) {
                produitRepository.deleteById(idProduit);
                reponse = true;
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return reponse;
    }

    public Produit createProduit(final ProduitDto dto) {
        Produit produit = new Produit();
        produit.setLibelle(dto.getLibelle());
        produit.setDescription(dto.getDescription());
        produit.setReference(dto.getReference());
        produit.setTarif(dto.getTarif());
        produit.setImage(dto.getImage());

        return produitRepository.save(produit);
    }

    public Produit updateProduit(final ProduitDto dto) {
        Produit produit = getById(dto.getId());

        produit.setLibelle(dto.getLibelle());
        produit.setDescription(dto.getDescription());
        produit.setReference(dto.getReference());
        produit.setTarif(dto.getTarif());
        produit.setImage(dto.getImage());

        return produitRepository.save(produit);
    }

    public List<Produit> recupererProduitsParCategorie(Long idCategorie) {
        return produitRepository.findByCategorieProduitId(idCategorie);
    }
}
