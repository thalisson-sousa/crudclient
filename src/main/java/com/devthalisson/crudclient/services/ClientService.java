package com.devthalisson.crudclient.services;

import com.devthalisson.crudclient.dto.ClientDTO;
import com.devthalisson.crudclient.entities.Client;
import com.devthalisson.crudclient.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Client entity = repository.findById(id).get();
        ClientDTO client = new ClientDTO(entity);
        return client;
    }

}
