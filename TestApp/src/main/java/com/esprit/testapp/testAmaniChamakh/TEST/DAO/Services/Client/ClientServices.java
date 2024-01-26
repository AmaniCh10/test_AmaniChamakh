package com.esprit.testapp.testAmaniChamakh.TEST.DAO.Services.Client;

import com.esprit.testapp.testAmaniChamakh.TEST.DAO.Repository.ClientRepo;
import com.esprit.testapp.testAmaniChamakh.TEST.DAO.entities.Client;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ClientServices implements iClientServices{
    @Autowired
    ClientRepo CR;

    @Override
    public List<Client> findAllClient() {
        return CR.findAll();
    }

    @Override
    public Client addClient(Client b) {
        return CR.save(b);
    }

    @Override
    public Client findClientById(Long id) {
        return CR.findById(id).orElse(Client.builder().idClient(0L).identifiant("client bizarre").build());
    }

    @Override
    public void deleteClient(Client b) {
     CR.delete(b);
    }
}


