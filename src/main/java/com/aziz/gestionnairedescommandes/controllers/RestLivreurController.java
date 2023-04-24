package com.aziz.gestionnairedescommandes.controllers;

import com.aziz.gestionnairedescommandes.entities.Livreur;
import com.aziz.gestionnairedescommandes.services.IlivreurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class RestLivreurController {
    @Autowired
    IlivreurService ilivreurService;

    @PostMapping("/livreurs")
    public boolean AddLivreur(@RequestBody Livreur livreur){
        return ilivreurService.AddLivreur(livreur);
    }
    @GetMapping("/livreurs")
    public List<Livreur> GetAll(){
        return ilivreurService.GetAll();
    }
    @DeleteMapping("/livreurs/{matricule}")
    public boolean DeleteLivreur(@PathVariable("matricule") long matricule){
        return ilivreurService.DeleteLivreur(matricule);
    }
    @PutMapping("/livreurs/{matricule}")
    public Livreur UpdateLivreur(@RequestBody Livreur livreur,@PathVariable("matricule") long matricule){
        return ilivreurService.UpdateLivreur(livreur,matricule);
    }
    @GetMapping("/livreurs/{matricule}")
    public Livreur FindLivreurById(@PathVariable("matricule") long matricule){
        return ilivreurService.FindLivreurById(matricule);
    }
    @GetMapping("/FindLivreursByName")
    public List<Livreur> FindLivreursByName(@RequestParam("nom") String nom){
        return ilivreurService.FindLivreursByName(nom);
    }
}
