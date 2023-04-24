package com.aziz.gestionnairedescommandes.services;

import com.aziz.gestionnairedescommandes.entities.Produit;

import java.util.List;

public interface IProduitService {
    public boolean AddProduit(Produit produit);
    public List<Produit> GetAll();
    public boolean DeleteProduit(int id);
    public Produit UpdateProduit(Produit produit,int id);
    public Produit FindProduitById(int id);
    public List<Produit> FindProduitsByName(String nom);
}
