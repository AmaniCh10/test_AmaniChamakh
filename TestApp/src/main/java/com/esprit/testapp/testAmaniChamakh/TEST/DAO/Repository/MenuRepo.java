package com.esprit.testapp.testAmaniChamakh.TEST.DAO.Repository;

import com.esprit.testapp.testAmaniChamakh.TEST.DAO.entities.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepo extends JpaRepository<Menu,Long> {
}
