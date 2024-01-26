package com.esprit.testapp.testAmaniChamakh.TEST.DAO.Repository;

import com.esprit.testapp.testAmaniChamakh.TEST.DAO.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<Client,Long> {
}
