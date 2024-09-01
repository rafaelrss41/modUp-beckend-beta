package com.modUp.beta.controller;

import com.modUp.beta.model.Clients;
import com.modUp.beta.service.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClientsController {

    @Autowired
    private ClientsService service;

    @PostMapping(value = "/save")
    public ResponseEntity<Clients> saveClient(@RequestBody Clients name) {
        name = service.save(name);
        return ResponseEntity.ok().body(name);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Clients> searchClientId(@PathVariable Long id) {
        Clients name = service.findById(id);
        return ResponseEntity.ok().body(name);
    }

    @GetMapping(value = "/findy-all-clients")
    public ResponseEntity<List<Clients>> findyAllClient() {
        List<Clients> names = service.findAll();
        return ResponseEntity.ok().body(names);
    }
}
