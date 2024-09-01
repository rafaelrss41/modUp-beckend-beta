package com.modUp.beta;

import com.modUp.beta.model.Clients;
import com.modUp.beta.repository.ClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class StartApllication  implements CommandLineRunner {


    @Autowired
    private ClientsRepository repository;


    @Override
    public void run(String... args) throws Exception {

        for (Clients c : repository.findAll()){
            System.out.println(c);
        }
    }
}

