package com.aziz.gestionnairedescommandes.controllers;

import com.aziz.gestionnairedescommandes.entities.Commande;
import com.aziz.gestionnairedescommandes.entities.Produit;
import com.aziz.gestionnairedescommandes.services.ICommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class RestCommandeController {
    @Autowired
    ICommandeService iCommandeService;

    @PostMapping("/commandes")
    public boolean AddCommande(@RequestBody Commande commande){
        return iCommandeService.AddCommande(commande);
    }

    @GetMapping("/commandes")
    public List<Commande> GetAll(){
        return iCommandeService.GetAll();
    }

    @DeleteMapping("/commandes/{idC}")
    public boolean DeleteCommande(@PathVariable("idC") int idC){
        return iCommandeService.DeleteCommande(idC);
    }
    @GetMapping("/commandes/{idC}")
    public Commande GetCommandeById(@PathVariable("idC") int idC){
        return iCommandeService.GetCommandeById(idC);
    }
    @PutMapping("/commandes/{idC}")
    public Commande UpdateCommande(@RequestBody Commande commande,@PathVariable("idC") int idC){
        return iCommandeService.UpdateCommande(commande,idC);
    }

}
