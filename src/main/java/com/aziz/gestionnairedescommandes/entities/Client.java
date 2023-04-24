package com.aziz.gestionnairedescommandes.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Client {
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
    private String email;
    private String pass;
    private Boolean isConnected;

    public Client(String nom, String prenom, String adresse,String phone,String email,String pass,Boolean isConnected) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.phone=phone;
        this.email=email;
        this.pass=pass;
        this.isConnected=isConnected;
    }
    @OneToMany(mappedBy = "client")
    private List<Commande> commandes;

    public Client() {
        nom = " ";
        prenom =" ";
        adresse= " ";
        phone =" ";
        email=" ";
        pass=" ";
        isConnected = false;
    }
}
