package com.aziz.gestionnairedescommandes.services;

import com.aziz.gestionnairedescommandes.entities.Client;
import com.aziz.gestionnairedescommandes.entities.Commande;
import com.aziz.gestionnairedescommandes.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientSevice implements IClientService{
    @Autowired
    ClientRepository clientRepository;

    @Override
    public boolean AddClient(Client client) {
        return clientRepository.save(client)!=null;
    }

    @Override
    public List<Client> GetAll() {
        return clientRepository.findAll();
    }

    @Override
    public boolean DeleteClient(int id) {
        clientRepository.deleteById(id);
        return !clientRepository.existsById(id);
    }

    @Override
    public Client UpdateClient(Client client, int id) {
        client.setId(id);
        return clientRepository.save(client);
    }

    @Override
    public Client FindClientById(int id) {
        Optional<Client> client = clientRepository.findById(id);
        return client.orElse(null);
    }

    @Override
    public List<Client> FindClientsByName(String nom) {
        return clientRepository.FindClientsByName(nom);
    }


}
