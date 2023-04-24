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
}
