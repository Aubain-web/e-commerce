/**
 * 
 */
package com.ecommerce.projet.dto;

import java.io.Serializable;

/**
 * 
 */
public class CategorieProduitDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String libelle;
	private String description;
	
	
	public CategorieProduitDto() {
		super();
	}
	
	public CategorieProduitDto(Long id, String libelle, String description) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.description = description;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "CategorieProduitDto [id=" + id + ", libelle=" + libelle + ", description=" + description + "]";
	}
	
}
