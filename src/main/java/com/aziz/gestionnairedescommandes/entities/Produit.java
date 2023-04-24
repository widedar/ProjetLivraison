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
    private String imageUrl;
    private boolean isAvailable;

    public Produit(String nomP, String description, Double prix, String imageUrl,boolean isAvailable) {
        this.nomP = nomP;
        this.description = description;
        this.prix = prix;
        this.imageUrl = imageUrl;
        this.isAvailable= isAvailable;
    }
    public Produit() {
        nomP = " ";
        description = " ";
        prix = 0.0;
        imageUrl = " ";
        isAvailable = true;
    }
    @ManyToMany(mappedBy = "produits")
    private List<Commande> commandes;

}
