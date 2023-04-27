package com.aziz.gestionnairedescommandes.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Fournisseur  implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int codeF;
	private String nom;
	private String prenom;
	@OneToMany
	private List<BonLivraison> bonlivraisons;
	public int getCodeF() {
		return codeF;
	}
	public void setCodeF(int codeF) {
		this.codeF = codeF;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Fournisseur(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	public Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Fournisseur [codeF=" + codeF + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	

}
