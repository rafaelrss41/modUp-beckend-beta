package com.modUp.beta.service;


import com.modUp.beta.exceptions.ClientNullException;
import com.modUp.beta.model.Clients;
import com.modUp.beta.repository.ClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientsService  {

    @Autowired
    private ClientsRepository repository;


    public Clients save(Clients name){

        return repository.save(name);
    }

    public Clients findById(Long id){
        return repository.findById(id).orElse(null);
    }

    public List<Clients> findAll(){
        return repository.findAll();
    }

}
