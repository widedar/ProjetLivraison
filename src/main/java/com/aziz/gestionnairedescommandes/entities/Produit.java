package com.aziz.gestionnairedescommandes.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nomP;
    private String description;
    private Double prix;
    
    
    public Produit(String nomP, String description, Double prix) {
        this.nomP = nomP;
        this.description = description;
        this.prix = prix;
      
    }
    public Produit() {
        nomP = " ";
        description = " ";
        prix = 0.0;
       
    }
    @ManyToMany(mappedBy = "produits")
    private List<Commande> commandes;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomP() {
		return nomP;
	}
	public void setNomP(String nomP) {
		this.nomP = nomP;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	
	
	public List<Commande> getCommandes() {
		return commandes;
	}
	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}
    
}
