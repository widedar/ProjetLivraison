package com.aziz.gestionnairedescommandes.controllers;

import com.aziz.gestionnairedescommandes.entities.Client;
import com.aziz.gestionnairedescommandes.services.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class RestClientController {
    @Autowired
    IClientService iClientService;
    @PostMapping("/clients")
    public boolean AddClient(@RequestBody Client client){
        return iClientService.AddClient(client);
    }
    @GetMapping("/clients")
    public List<Client> GetALL(){
        return iClientService.GetAll();
    }
    @DeleteMapping("/clients/{id}")
    public boolean DeleteClient(@PathVariable("id") int id){
        return iClientService.DeleteClient(id);
    }
    @PutMapping("/clients/{id}")
    public Client UpdateClient(@RequestBody Client client,@PathVariable("id") int id){
        return iClientService.UpdateClient(client,id);
    }
    @GetMapping("/clients/{id}")
    public Client FindClientById(@PathVariable("id") int id){
        return iClientService.FindClientById(id);
    }
    @GetMapping("/FindClientsByName")
    public List<Client> FindClientsByName(@RequestParam("nom") String nom){
        return iClientService.FindClientsByName(nom);
    }
}
