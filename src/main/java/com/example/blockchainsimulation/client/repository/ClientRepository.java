package com.example.blockchainsimulation.client.repository;

import com.example.blockchainsimulation.client.data.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
}
