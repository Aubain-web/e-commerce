/**
 * 
 */
package com.ecommerce.projet.repository;

import com.ecommerce.projet.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.projet.entity.CategorieProduit;

/**
 * 
 */
@Repository
public interface CategorieProduitRepository extends JpaRepository<CategorieProduit, Long>{

	// CRUD par défaut / Create / Read / Update / Delete
}
