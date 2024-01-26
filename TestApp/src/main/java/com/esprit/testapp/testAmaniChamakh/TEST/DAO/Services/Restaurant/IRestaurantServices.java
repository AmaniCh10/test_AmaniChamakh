package com.esprit.testapp.testAmaniChamakh.TEST.DAO.Services.Restaurant;

import com.esprit.testapp.testAmaniChamakh.TEST.DAO.entities.Menu;
import com.esprit.testapp.testAmaniChamakh.TEST.DAO.entities.Restaurant;

import java.util.List;

public interface IRestaurantServices {
    List<Restaurant> findAllRes();

    Restaurant addRes(Menu b);

    Restaurant findResById(Long id);

    void deleteRes(Restaurant b);
    Restaurant ajouterRestaurantEtMenuAssocie(Restaurant rest);
}
