package com.aziz.gestionnairedescommandes.services;

import com.aziz.gestionnairedescommandes.entities.Commande;
import com.aziz.gestionnairedescommandes.entities.Produit;
import com.aziz.gestionnairedescommandes.repositories.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommandeService implements ICommandeService{
    @Autowired
    CommandeRepository commandeRepository;
    @Override
    public boolean AddCommande(Commande commande) {
        return commandeRepository.save(commande)!=null;
    }

    @Override
    public List<Commande> GetAll() {
        return commandeRepository.findAll();
    }

    @Override
    public Commande GetCommandeById(int idC) {
        Optional<Commande> commande = commandeRepository.findById(idC);
        return commande.orElse(null);
    }

    @Override
    public boolean DeleteCommande(int idC) {
        commandeRepository.deleteById(idC);
        return !commandeRepository.existsById(idC);
    }

    @Override
    public Commande UpdateCommande(Commande commande, int idC) {
        commande.setIdC(idC);
        return commandeRepository.save(commande);
    }



}
