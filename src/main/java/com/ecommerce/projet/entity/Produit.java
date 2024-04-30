/**
 * 
 */
package com.ecommerce.projet.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "produit")
public class Produit implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "libelle", nullable = false)
	private String libelle;
	
	@Column(nullable = true, unique = false)
	private String description;
	
	@Column(name = "reference", unique = true, nullable = false)
	private String reference;
	
	@Column(name="tarif", nullable = false)
	private double tarif;
	
	@Column(name = "image", nullable = true)
	private String image;
	
	@ManyToOne
	@JoinColumn(name = "categorie_produit_id", foreignKey = @ForeignKey(name = "fk_pproduit_roduit_categorie"))
	private CategorieProduit categorieProduit;

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

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public double getTarif() {
		return tarif;
	}

	public void setTarif(double tarif) {
		this.tarif = tarif;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	/*public Long getCategorieProduitId() {
		return categorieProduitId;
	}

	public void setCategorieProduitId(Long categorieProduitId) {
		this.categorieProduitId = categorieProduitId;
	}*/

}
