package com.example.blockchainsimulation.client.service;

import com.example.blockchainsimulation.client.data.Client;
import com.example.blockchainsimulation.client.data.ClientDto;

import java.util.List;
import java.util.Optional;

public interface ClientServiceInterface {

    Optional<Client> addClient(ClientDto clientDto);

    Optional<List<Client>> findClientByLogin(String login);
}
