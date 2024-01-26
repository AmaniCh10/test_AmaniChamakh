package com.esprit.testapp.testAmaniChamakh.TEST.DAO.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto-increment

    private Long idClient;

    private String identifiant;
    private LocalDate datePremiereVisite;
    @ManyToMany
    List<Menu> listMenu;


}
