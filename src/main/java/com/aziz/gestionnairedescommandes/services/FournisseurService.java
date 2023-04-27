package com.aziz.gestionnairedescommandes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aziz.gestionnairedescommandes.entities.Fournisseur;
import com.aziz.gestionnairedescommandes.repositories.FournisseurRepository;

@Service
public class FournisseurService implements FournisseurImpl {
   @Autowired
   FournisseurRepository fournisseurRepository;
	@Override
	public boolean AddFournisseur(Fournisseur f) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Fournisseur> GetAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean DeleteFournisseur(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Fournisseur UpdateFournisseur(Fournisseur client, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fournisseur FindFournisseurById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Fournisseur> FindFournisseurByName(String nom) {
		// TODO Auto-generated method stub
		return null;
	}

}
