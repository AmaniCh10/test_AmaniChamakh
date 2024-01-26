package com.esprit.testapp.testAmaniChamakh.TEST.DAO.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Composant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto-increment

    private Long idComposant;
    private String nomComposant;
    private Float prix;
    @ManyToOne
    Menu m;


}
