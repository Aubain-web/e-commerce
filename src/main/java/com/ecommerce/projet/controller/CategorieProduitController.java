/**
 * 
 */
package com.ecommerce.projet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.projet.dto.CategorieProduitDto;
import com.ecommerce.projet.entity.CategorieProduit;
import com.ecommerce.projet.service.CategorieProduitService;

/**
 * 
 */
//@Controller
@RestController // @RestController = @Controller + @ResponseBody
@RequestMapping(value = "/categorie-produit")
public class CategorieProduitController {

	// INJECTION DES DEPENDENCES
	@Autowired
	private CategorieProduitService categorieProduitService;
	
	/**
	 * Méthode permettant de retourner la liste des categories de produit
	 * 
	 * @return Retourne la liste des categories produits
	 */
	//@ResponseBody
	@RequestMapping(value = "/recuperer-tout", method = RequestMethod.GET)
	public List<CategorieProduit> recupererTout(){
		return categorieProduitService.recupererTout();
	}
	
	/**
	 * Méthode permettant de récuperer la categorie de produit
	 * 
	 * @param id contient l'identifiant de la catégorie de produit récupéré après le (/)
	 * 
	 * @param idCategorieProduit idCategorie contient l'identifiant de la 
	 * catégorie de produit récupéré dans l'url sous la variable idCategorieProduit
	 * 
	 * @return la categorie de produit selectionnée
	 */
	@RequestMapping(value = "/recuperer-par-id/{id}", method = RequestMethod.GET)
	public CategorieProduit recupererParId(@PathVariable Long id, Long idCategorieProduit){
		return categorieProduitService.recupererParId(idCategorieProduit);
	}
	
	/**
	 * Méthode permettant de supprimer la catégorie du produit
	 * 
	 * @param id contient l'identifiant de la catégorie de produit récupéré après le (/)
	 * 
	 * @return vrai si la categorie du produit a été supprimée sinon false
	 */
	@RequestMapping(value = "/supprimer-par-id/{id}", method = RequestMethod.GET)
	public boolean supprimerParId(@PathVariable Long id) {
		return categorieProduitService.supprimerParId(id);
	}
	
	@RequestMapping(value = "/creer", method = RequestMethod.POST)
	public CategorieProduit creerCategorieProduit(@RequestBody CategorieProduitDto dto) {
		return categorieProduitService.creerCategorieProduit(dto);
	}
	
	@RequestMapping(value = "/modifier", method = RequestMethod.PUT)
	public CategorieProduit modifierCategorieProduit(@RequestBody CategorieProduitDto dto) {
		return categorieProduitService.modifierCategorieProduit(dto);
	}
}
