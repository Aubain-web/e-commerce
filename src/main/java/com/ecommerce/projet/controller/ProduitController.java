package com.ecommerce.projet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ecommerce.projet.dto.ProduitDto;
import com.ecommerce.projet.entity.Produit;
import com.ecommerce.projet.service.ProduitService;

@RestController
@RequestMapping(value = "/produit")
public class ProduitController {

   @Autowired
   private ProduitService produitService;

   @RequestMapping(value = "/getAll", method = RequestMethod.GET)
   public List<Produit> recupererTout() {
      return produitService.getAll();
   }

   @RequestMapping(value = "/getByid/{id}", method = RequestMethod.GET)
   public Produit recupererParId(@PathVariable Long id) {
      return produitService.getById(id);
   }

   @RequestMapping(value = "/deleteByid/{id}", method = RequestMethod.GET)
   public boolean supprimerParId(@PathVariable Long id) {
      return produitService.deleteById(id);
   }

   @RequestMapping(value = "/create", method = RequestMethod.POST)
   public Produit creerProduit(@RequestBody ProduitDto dto) {
      return produitService.createProduit(dto);
   }

   @RequestMapping(value = "/update", method = RequestMethod.PUT)
   public Produit modifierProduit(@RequestBody ProduitDto dto) {
      return produitService.updateProduit(dto);
   }
   @GetMapping("/getbycategorie/{idCategorie}")
   public List<Produit> recupererProduitsParCategorie(@PathVariable Long idCategorie) {
      return produitService.recupererProduitsParCategorie(idCategorie);
   }
}
