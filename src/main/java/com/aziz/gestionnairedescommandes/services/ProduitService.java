package com.aziz.gestionnairedescommandes.services;

import com.aziz.gestionnairedescommandes.entities.Produit;
import com.aziz.gestionnairedescommandes.repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProduitService implements IProduitService{
    @Autowired
    ProduitRepository produitRepository;
    @Override
    public boolean AddProduit(Produit produit) {
        return produitRepository.save(produit)!=null;
    }

    @Override
    public List<Produit> GetAll() {
        return produitRepository.findAll();
    }

    @Override
    public boolean DeleteProduit(int id) {
        produitRepository.deleteById(id);
        return !produitRepository.existsById(id);
    }

    @Override
    public Produit UpdateProduit(Produit produit, int id) {
        produit.setId(id);
        return produitRepository.save(produit);
    }

    @Override
    public Produit FindProduitById(int id) {
        Optional<Produit> produit = produitRepository.findById(id);
        return produit.orElse(null);
    }

    @Override
    public List<Produit> FindProduitsByName(String nom) {
        return produitRepository.FindProduitsByName(nom);
    }
}
