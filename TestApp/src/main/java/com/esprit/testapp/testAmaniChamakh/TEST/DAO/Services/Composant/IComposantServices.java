package com.esprit.testapp.testAmaniChamakh.TEST.DAO.Services.Composant;

import com.esprit.testapp.testAmaniChamakh.TEST.DAO.entities.Client;
import com.esprit.testapp.testAmaniChamakh.TEST.DAO.entities.Composant;

import java.util.List;

public interface IComposantServices {
    List<Composant> findAllComposant();

    Composant addComposant(Composant b);

    Composant findComposantById(Long id);

    void deleteComposant(Composant b);
}
