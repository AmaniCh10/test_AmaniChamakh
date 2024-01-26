package com.esprit.testapp.testAmaniChamakh.TEST.DAO.Services.Menu;

import com.esprit.testapp.testAmaniChamakh.TEST.DAO.entities.Client;
import com.esprit.testapp.testAmaniChamakh.TEST.DAO.entities.Menu;

import java.util.List;

public interface IMenuServices {
    List<Menu> findAllMenu();

    Menu addMenu(Menu b);

    Menu findMenuById(Long id);

    void deleteMenu(Menu b);
}
