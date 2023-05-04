package com.example.blockchainsimulation.client.controller;

import com.example.blockchainsimulation.client.data.Client;
import com.example.blockchainsimulation.client.data.ClientDto;
import com.example.blockchainsimulation.client.mapper.ClientMapper;
import com.example.blockchainsimulation.client.service.ClientServiceInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequestMapping("/app/blockchain/client")
@RestController
public class ClientController {

    private final ClientServiceInterface userService;

    public ClientController(ClientServiceInterface userService) {
        this.userService = userService;
    }

    @PostMapping()
    public ResponseEntity<ClientDto> addClient(@RequestBody ClientDto clientDto) {
        Optional<Client> savedUser = userService.addClient(clientDto);
        if(savedUser.isPresent()) {
            return ResponseEntity.ok().body(clientDto);
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/showClientByLogin/{login}")
    public ResponseEntity<List<ClientDto>> showClientByLogin(@PathVariable String login) {
        Optional<List<Client>> clients = userService.findClientByLogin(login);

        if(clients.isPresent()){
            List<ClientDto> clientDtos = new ArrayList<>();
            for(Client client : clients.get()){
                clientDtos.add(ClientMapper.mapClientToClientDto(client));
            }
            return ResponseEntity.ok().body(clientDtos);
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }
}
