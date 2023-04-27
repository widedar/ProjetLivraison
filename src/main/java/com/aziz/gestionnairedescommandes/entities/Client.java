package com.aziz.gestionnairedescommandes.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    @Column(length = 25)
    private String nom;
    @Column(length = 25)
    private String prenom;
    @Column(length = 50)
    private String adresse;

    private String phone;
    

    public Client(String nom, String prenom, String adresse,String phone) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.phone=phone;
        
    }
    @OneToMany(mappedBy = "client")
    private List<Commande> commandes;

    public Client() {
        nom = " ";
        prenom =" ";
        adresse= " ";
        phone =" ";
        
    }

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}


	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}
    
}
