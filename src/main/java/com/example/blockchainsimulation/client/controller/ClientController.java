package com.example.blockchainsimulation.client.controller;

import com.example.blockchainsimulation.client.mapper.ClientMapper;
import com.example.blockchainsimulation.client.service.ClientService;
import com.example.blockchainsimulation.client.data.Client;
import com.example.blockchainsimulation.client.data.ClientDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequestMapping("/app/blockchain/client/")
@RestController
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping()
    public ResponseEntity<ClientDto> addUser(@RequestBody ClientDto clientDto) {
        Optional<Client> savedUser = clientService.addUser(clientDto);
        if(savedUser.isPresent()) {
            return ResponseEntity.ok().body(clientDto);
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/showClientByName/{login}")
    public ResponseEntity<List<ClientDto>> showUserByName(@PathVariable String login) {
        Optional<List<Client>> users = clientService.findUserByLogin(login);

        if(users.isPresent()){
            List<ClientDto> clientDtos = new ArrayList<>();
            for(Client user : users.get()){
                clientDtos.add(ClientMapper.mapClientToClientDto(user));
            }
            return ResponseEntity.ok().body(clientDtos);
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }
}
