package com.aziz.gestionnairedescommandes.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.aziz.gestionnairedescommandes.entities.Client;
import com.aziz.gestionnairedescommandes.entities.Fournisseur;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Integer> {
	  @Query("select f from Fourniseur f where f.nom like ?1%")
	    public List<Fournisseur> FindFournisseurByName(String nom);

}
