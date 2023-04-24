package com.aziz.gestionnairedescommandes.services;

import com.aziz.gestionnairedescommandes.entities.Commande;
import com.aziz.gestionnairedescommandes.entities.Produit;

import java.util.List;

public interface ICommandeService {
    public boolean AddCommande(Commande commande);
    public List<Commande> GetAll();
    public Commande GetCommandeById(int idC);
    public boolean DeleteCommande(int idC);
    public Commande UpdateCommande(Commande commande,int idC);

}
