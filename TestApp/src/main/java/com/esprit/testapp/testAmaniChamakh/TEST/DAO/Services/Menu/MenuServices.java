package com.esprit.testapp.testAmaniChamakh.TEST.DAO.Services.Menu;

import com.esprit.testapp.testAmaniChamakh.TEST.DAO.Repository.ClientRepo;
import com.esprit.testapp.testAmaniChamakh.TEST.DAO.Repository.MenuRepo;
import com.esprit.testapp.testAmaniChamakh.TEST.DAO.Services.Client.iClientServices;
import com.esprit.testapp.testAmaniChamakh.TEST.DAO.entities.Client;
import com.esprit.testapp.testAmaniChamakh.TEST.DAO.entities.Menu;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;
@Service
@AllArgsConstructor

public class MenuServices implements IMenuServices{
@Autowired
MenuRepo MR;
    @Override
    public List<Menu> findAllMenu() {
        return null;
    }

    @Override
    public Menu addMenu(Menu b) {
        return null;
    }

    @Override
    public Menu findMenuById(Long id) {
        return null;
    }

    @Override
    public void deleteMenu(Menu b) {

    }
}
