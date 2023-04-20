package com.example.blockchainsimulation.client.service;

import com.example.blockchainsimulation.client.data.Client;
import com.example.blockchainsimulation.client.data.ClientDto;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    Optional<Client> addUser(ClientDto clientDto);

    Optional<List<Client>> findUserByLogin(String login);
}
