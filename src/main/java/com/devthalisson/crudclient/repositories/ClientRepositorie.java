package com.devthalisson.crudclient.repositories;

import com.devthalisson.crudclient.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepositorie extends JpaRepository<Client, Long> {
}
