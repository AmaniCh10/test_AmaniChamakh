package com.esprit.testapp.testAmaniChamakh.TEST.DAO.RestController;

import com.esprit.testapp.testAmaniChamakh.TEST.DAO.Services.Client.iClientServices;
import com.esprit.testapp.testAmaniChamakh.TEST.DAO.entities.Client;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Client")
@AllArgsConstructor
public class ClientRestController {

    iClientServices icr;
    @GetMapping("getALLClient")
    public List<Client> getAll(){
        return icr.findAllClient();

    }
    @PostMapping("addClient")
    public Client addClient(@RequestBody Client b){
        return icr.addClient(b);
    }

    @GetMapping("getClientById")
    public Client getById(@RequestParam Long id ){
        return icr.findClientById(id);
    }
    /*  @GetMapping("getById/{id}")
    public Bloc getById(@PathVariable Long id ){
        return iblocSer.findBlocById(id);
    }*/


    @DeleteMapping("deleteClient")
    public void deleteClient(@RequestParam Client b){
        icr.deleteClient(b);
        System.out.println("bloc deleted ");
    }

}
