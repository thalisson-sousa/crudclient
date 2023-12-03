package com.devthalisson.crudclient.controllers;

import com.devthalisson.crudclient.dto.ClientDTO;
import com.devthalisson.crudclient.entities.Client;
import com.devthalisson.crudclient.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<ClientDTO> findById(@PathVariable Long id){
        ClientDTO result = service.findById(id);
        return ResponseEntity.status(200).body(result);
    }
}
