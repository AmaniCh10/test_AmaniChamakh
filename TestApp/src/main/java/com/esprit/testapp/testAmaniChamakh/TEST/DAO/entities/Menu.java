package com.esprit.testapp.testAmaniChamakh.TEST.DAO.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto-increment

    private Long idMenu;

    private String libelleMenu;
    @Enumerated(EnumType.STRING)
    private TypeMenu typeMenu;

    @ManyToMany(mappedBy = "listMenu")
    List<Client> listClient;
    @OneToMany(mappedBy = "m")
    List<Composant>listComposant;
}
