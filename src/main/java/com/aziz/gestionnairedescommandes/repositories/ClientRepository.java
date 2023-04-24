package com.aziz.gestionnairedescommandes.repositories;

import com.aziz.gestionnairedescommandes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client,Integer> {
    @Query("select c from Client c where c.nom like ?1%")
    public List<Client> FindClientsByName(String nom);
}
