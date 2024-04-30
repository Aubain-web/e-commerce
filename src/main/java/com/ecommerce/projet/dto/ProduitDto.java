package com.ecommerce.projet.dto;

import java.io.Serializable;

public class ProduitDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String libelle;
    private String description;
    private String reference;
    private double tarif;
    private String image;
    private Long categorieProduitId;

    public ProduitDto() {
        super();
    }

    public ProduitDto(Long id, String libelle, String description, String reference, double tarif, String image, Long categorieProduitId) {
        super();
        this.id = id;
        this.libelle = libelle;
        this.description = description;
        this.reference = reference;
        this.tarif = tarif;
        this.image = image;
        this.categorieProduitId = categorieProduitId;
    }

    // Getters and setters

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

    public Long getCategorieProduitId() {
        return categorieProduitId;
    }

    public void setCategorieProduitId(Long categorieProduitId) {
        this.categorieProduitId = categorieProduitId;
    }

    @Override
    public String toString() {
        return "ProduitDto{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", description='" + description + '\'' +
                ", reference='" + reference + '\'' +
                ", tarif=" + tarif +
                ", image='" + image + '\'' +
                ", categorieProduitId=" + categorieProduitId +
                '}';
    }
}
