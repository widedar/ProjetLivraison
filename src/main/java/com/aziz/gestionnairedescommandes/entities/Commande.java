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
}
