package com.aziz.gestionnairedescommandes.services;

import com.aziz.gestionnairedescommandes.entities.Livreur;

import java.util.List;

public interface IlivreurService {
    public boolean AddLivreur(Livreur livreur);
    public List<Livreur> GetAll();
    public boolean DeleteLivreur(long matricule);
    public Livreur UpdateLivreur(Livreur livreur,long matricule);
    public Livreur FindLivreurById(long matricule);
    public List<Livreur> FindLivreursByName(String nom);

}
