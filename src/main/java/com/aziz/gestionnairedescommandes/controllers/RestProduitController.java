package com.aziz.gestionnairedescommandes.controllers;

import com.aziz.gestionnairedescommandes.entities.Produit;
import com.aziz.gestionnairedescommandes.services.IProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class RestProduitController {
    @Autowired
    IProduitService iProduitService;

    @PostMapping("/produits")
    public boolean AddProduit(@RequestBody Produit produit){
        return iProduitService.AddProduit(produit);
    }
    @GetMapping("/produits")
    public List<Produit> GetAll(){
        return iProduitService.GetAll();
    }
    @DeleteMapping("/produits/{id}")
    public boolean DeleteProduit(@PathVariable("id") int id){
        return iProduitService.DeleteProduit(id);
    }
    @PutMapping("/produits/{id}")
    public Produit UpdateProduit(@RequestBody Produit produit,@PathVariable("id") int id){
       return iProduitService.UpdateProduit(produit,id);
    }
    @GetMapping("/produits/{id}")
    public Produit FindProduitById(@PathVariable("id") int id){
        return iProduitService.FindProduitById(id);
    }
    @GetMapping("/FindProduitsByName")
    public List<Produit> FindProduitsByName(@RequestParam("nom") String nom){
        return iProduitService.FindProduitsByName(nom);
    }
}
