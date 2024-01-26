package com.esprit.testapp.testAmaniChamakh.TEST.DAO.Repository;

import com.esprit.testapp.testAmaniChamakh.TEST.DAO.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepo extends JpaRepository<Restaurant,Long> {
}
