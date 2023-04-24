package com.aziz.gestionnairedescommandes.repositories;

import com.aziz.gestionnairedescommandes.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande,Integer> {
}
