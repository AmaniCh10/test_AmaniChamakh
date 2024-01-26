package com.esprit.testapp.testAmaniChamakh.TEST.DAO.Services.Client;

import com.esprit.testapp.testAmaniChamakh.TEST.DAO.entities.Client;

import java.util.List;

public interface iClientServices {
    List<Client> findAllClient();

        Client addClient(Client b);

    Client findClientById(Long id);

    void deleteClient(Client b);
}
