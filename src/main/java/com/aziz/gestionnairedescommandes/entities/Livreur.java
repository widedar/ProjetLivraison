package com.aziz.gestionnairedescommandes.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Livreur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long matricule;

    @Column(length = 25)
    private String nom;
    @Column(length = 25)
    private String prenom;
    private String NumVoiture;
    private boolean isAvailable;
    @OneToMany
    private List<BonLivraison> bonlivraisons;

    public Livreur(String nom, String prenom, String numVoiture, boolean isAvailable) {
        this.nom = nom;
        this.prenom = prenom;
        this.NumVoiture = numVoiture;
        this.isAvailable = isAvailable;
    }
    public Livreur() {
        nom = " ";
        prenom = " ";
        NumVoiture = " ";
        isAvailable = false;
    }
	public long getMatricule() {
		return matricule;
	}
	public void setMatricule(long matricule) {
		this.matricule = matricule;
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
	public String getNumVoiture() {
		return NumVoiture;
	}
	public void setNumVoiture(String numVoiture) {
		NumVoiture = numVoiture;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
    
}
