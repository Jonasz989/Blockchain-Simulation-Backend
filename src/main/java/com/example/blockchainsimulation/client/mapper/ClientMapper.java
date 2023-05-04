package com.example.blockchainsimulation.client.mapper;

import com.example.blockchainsimulation.client.data.Client;
import com.example.blockchainsimulation.client.data.ClientDto;

import java.util.Optional;

public class ClientMapper {

    public static Client mapClientDtoToClient(ClientDto clientDto) {
        Client client = new Client();
        client.setClientUUID(clientDto.getClientUUID());
        client.setLogin(clientDto.getLogin());
        client.setPassword(clientDto.getPassword());
        client.setWalletUUID(clientDto.getWalletUUID());
        return client;
    }

    public static ClientDto mapClientToClientDto(Client client) {
        ClientDto clientDto = new ClientDto();
        clientDto.setClientUUID(client.getClientUUID());
        clientDto.setLogin(client.getLogin());
        clientDto.setPassword(client.getPassword());
        clientDto.setWalletUUID(client.getWalletUUID());
        return clientDto;
    }

    public static Client mapOptionalUserDtoToUser(Optional<ClientDto> clientDto) {
        return mapClientDtoToClient(clientDto.get());
    }

    public static ClientDto mapOptionalUserToUserDto(Optional<Client> client) {
        return mapClientToClientDto(client.get());
    }
}
