package com.aziz.gestionnairedescommandes.repositories;

import com.aziz.gestionnairedescommandes.entities.Livreur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LivreurRepository extends JpaRepository<Livreur,Long> {
    @Query("select l from Livreur l where l.nom like ?1%")
    public List<Livreur> FindLivreursByName(String nom);
}
