package com.example.blockchainsimulation.client.mapper;

import com.example.blockchainsimulation.client.data.Client;
import com.example.blockchainsimulation.client.data.ClientDto;
import com.example.blockchainsimulation.wallet.data.Wallet;

import java.util.Optional;

public class ClientMapper {

    public static Client mapClientDtoToClient(ClientDto clientDto) {

        Client client = new Client();
        client.setClientUUID(clientDto.getClientUUID());
        client.setLogin(clientDto.getLogin());
        client.setPassword(clientDto.getPassword());
        client.setWalletUUID(clientDto.getWalletUUID());

        Wallet wallet = new Wallet();
        wallet.setClientUUID(clientDto.getClientUUID());
        wallet.setWalletUUID(clientDto.getWalletUUID());
        wallet.setTransactionList(clientDto.getWalletDto().getTransactions());
        client.setWallet(wallet);
        wallet.setClient(client);
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
    public static Client mapOptionalClientDtoToClient(Optional<ClientDto> userDto) {
        return mapClientDtoToClient(userDto.get());
    }

    public static ClientDto mapOptionalClientToClientDto(Optional<Client> user) {
        return mapClientToClientDto(user.get());
    }
}
