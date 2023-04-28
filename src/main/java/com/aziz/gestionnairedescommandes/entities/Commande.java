package com.aziz.gestionnairedescommandes.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idC;
    @Temporal(TemporalType.DATE)
    private LocalDate DateCommande;

    private Double prixTotale;

    public Commande(LocalDate dateCommande,Double prixTotale) {
        DateCommande = dateCommande;
        this.prixTotale = prixTotale;
    }

    public Commande() {
        DateCommande = LocalDate.now();
        prixTotale=0.0;
    }

    @ManyToOne
    @JoinColumn(name = "client_id")
    
    private Client client;
    @ManyToMany
    @JoinTable(
            name = "commande_produits",
            joinColumns = @JoinColumn(name = "commande_id"),
            inverseJoinColumns = @JoinColumn(name = "produit_id")
    )
    private List<Produit> produits;

	public int getIdC() {
		return idC;
	}

	public void setIdC(int idC) {
		this.idC = idC;
	}

	public LocalDate getDateCommande() {
		return DateCommande;
	}

	public void setDateCommande(LocalDate dateCommande) {
		DateCommande = dateCommande;
	}

	public Double getPrixTotale() {
		return prixTotale;
	}

	public void setPrixTotale(Double prixTotale) {
		this.prixTotale = prixTotale;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
  
}
