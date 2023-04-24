package com.aziz.gestionnairedescommandes.services;

import com.aziz.gestionnairedescommandes.entities.Livreur;
import com.aziz.gestionnairedescommandes.repositories.LivreurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivreurService implements IlivreurService{
    @Autowired
    LivreurRepository livreurRepository;
    @Override
    public boolean AddLivreur(Livreur livreur) {
        return livreurRepository.save(livreur)!=null;
    }

    @Override
    public List<Livreur> GetAll() {
        return livreurRepository.findAll();
    }

    @Override
    public boolean DeleteLivreur(long matricule) {
        livreurRepository.deleteById(matricule);
        return !livreurRepository.existsById(matricule);
    }

    @Override
    public Livreur UpdateLivreur(Livreur livreur, long matricule) {
        livreur.setMatricule(matricule);
        return livreurRepository.save(livreur);
    }

    @Override
    public Livreur FindLivreurById(long matricule) {
        Optional<Livreur> livreur = livreurRepository.findById(matricule);
        return livreur.orElse(null);
    }

    @Override
    public List<Livreur> FindLivreursByName(String nom) {
        return livreurRepository.FindLivreursByName(nom);
    }
}
