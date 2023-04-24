package com.aziz.gestionnairedescommandes.repositories;
import com.aziz.gestionnairedescommandes.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit,Integer> {
    @Query("select p from Produit p where p.nomP like ?1%")
    public List<Produit> FindProduitsByName(String nom);
}
