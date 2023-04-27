package com.aziz.gestionnairedescommandes.services;

import java.util.List;

import com.aziz.gestionnairedescommandes.entities.Client;
import com.aziz.gestionnairedescommandes.entities.Fournisseur;

public interface FournisseurImpl {
	  public boolean AddFournisseur(Fournisseur f);
	    public List<Fournisseur> GetAll();
	    public boolean DeleteFournisseur(int id);
	    public Fournisseur UpdateFournisseur(Fournisseur client,int id);
	    public Fournisseur FindFournisseurById(int id);
	    public List<Fournisseur> FindFournisseurByName(String nom);
}
