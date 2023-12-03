package com.devthalisson.crudclient.services;

import com.devthalisson.crudclient.entities.Client;
import com.devthalisson.crudclient.repositories.ClientRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepositorie repositorie;

    @Transactional(readOnly = true)
    public Client findById(Long id) {
        Client client = repositorie.findById(id).get();
        return client;
    }
}
