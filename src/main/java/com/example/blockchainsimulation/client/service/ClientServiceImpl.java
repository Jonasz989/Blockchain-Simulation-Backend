package com.example.blockchainsimulation.client.service;

import com.example.blockchainsimulation.client.data.Client;
import com.example.blockchainsimulation.client.data.ClientDto;
import com.example.blockchainsimulation.client.mapper.ClientMapper;
import com.example.blockchainsimulation.client.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Optional<Client> addUser(ClientDto clientDto) {
        Client user = ClientMapper.mapClientDtoToClient(clientDto);
        System.out.println("tutaj 1");

        Optional<Client> savedUser = Optional.of(clientRepository.save(user));
        System.out.println("Tutaj 2");
        if(savedUser.isPresent()){
            return savedUser;
        } else {
            return Optional.empty();
        }
    }

    @Override
    public Optional<List<Client>> findUserByLogin(String login) {
        Iterable<Client> usersList = clientRepository.findAll();
        List<Client> finalList = new ArrayList<>();
        for(Client user : usersList) {
            if(user.getLogin().equals(login)){
                finalList.add(user);
            }
        }
        if(finalList.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(finalList);
    }
}
