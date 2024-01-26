package com.esprit.testapp.testAmaniChamakh.TEST.DAO.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto-increment

    private Long idRestaurant;

    private String nom;
    private Long nbPlacesMax;


}
