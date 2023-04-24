package com.aziz.gestionnairedescommandes.services;

import com.aziz.gestionnairedescommandes.entities.Client;
import com.aziz.gestionnairedescommandes.entities.Commande;

import java.util.List;

public interface IClientService {
    public boolean AddClient(Client client);
    public List<Client> GetAll();
    public boolean DeleteClient(int id);
    public Client UpdateClient(Client client,int id);
    public Client FindClientById(int id);
    public List<Client> FindClientsByName(String nom);
}
