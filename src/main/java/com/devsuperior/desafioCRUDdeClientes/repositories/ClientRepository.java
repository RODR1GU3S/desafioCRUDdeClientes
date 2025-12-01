package com.devsuperior.desafioCRUDdeClientes.repositories;

import com.devsuperior.desafioCRUDdeClientes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
