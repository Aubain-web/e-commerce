/**
 * 
 */
package com.ecommerce.projet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.projet.dto.CategorieProduitDto;
import com.ecommerce.projet.entity.CategorieProduit;
import com.ecommerce.projet.repository.CategorieProduitRepository;

/**
 * 
 */
@Service
public class CategorieProduitService {

	// INSTANCIATION DE DONNEES
	@Autowired 
	private CategorieProduitRepository categorieProduitRepository;
	
	// TODO : Recuperation de la liste des categories produit
	public List<CategorieProduit> recupererTout(){
		return categorieProduitRepository.findAll();
	}
	
	// TODO : Recuperer une categorie de produit en fonction de son identifiant
	public CategorieProduit recupererParId(final Long idCategorieProduit) {
		return categorieProduitRepository.findById(idCategorieProduit).orElse(null);
	}
	
	// TODO : Supprimer une categorie de produit en fonction de son identifiant
	public boolean supprimerParId(final Long idCategorieProduit) {
		boolean reponse = false;
		
		// TODO : capturer (catcher) une exception
		try {
			// TODO : Verifions si le produit existe
			if(categorieProduitRepository.existsById(idCategorieProduit)) {
				categorieProduitRepository.deleteById(idCategorieProduit);
				reponse = true;
			}			
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
		return reponse;
	}
	
	/**
	 * Méthode permettant de mapper les informations de la catégorie de produit
	 * 
	 * @param dto l'objet de transport de données de notre réquête
	 * 
	 * @return l'objet persisté en base de données
	 */
	public CategorieProduit creerCategorieProduit(final CategorieProduitDto dto) {
		
		CategorieProduit categorieProduit = new CategorieProduit();
		categorieProduit.setDescription(dto.getDescription());
		categorieProduit.setLibelle(dto.getLibelle());
		
		return categorieProduitRepository.save(categorieProduit);
	}
	
	/**
	 * Méthode permettant de mapper les informations de la catégorie de produit
	 * 
	 * @param dto l'objet de transport de données de notre réquête
	 * 
	 * @return l'objet persisté en base de données
	 */
	public CategorieProduit modifierCategorieProduit(final CategorieProduitDto dto) {
		
		CategorieProduit categorieProduit = recupererParId(dto.getId());
		
		categorieProduit.setDescription(dto.getDescription());
		categorieProduit.setLibelle(dto.getLibelle());
		
		return categorieProduitRepository.save(categorieProduit);
	}
}
