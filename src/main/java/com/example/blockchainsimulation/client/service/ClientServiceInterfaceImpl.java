package com.example.blockchainsimulation.client.service;

import com.example.blockchainsimulation.client.data.Client;
import com.example.blockchainsimulation.client.data.ClientDto;
import com.example.blockchainsimulation.client.mapper.ClientMapper;
import com.example.blockchainsimulation.client.repository.ClientRepository;
import com.example.blockchainsimulation.wallet.data.Wallet;
import com.example.blockchainsimulation.wallet.repository.WalletRepository;
import com.example.blockchainsimulation.wallet.service.WalletService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class ClientServiceInterfaceImpl implements ClientServiceInterface {

    private final ClientRepository clientRepository;
    private final WalletService walletService;
    private final WalletRepository walletRepository;

    public ClientServiceInterfaceImpl(ClientRepository clientRepository, WalletService walletService, WalletRepository walletRepository) {
        this.clientRepository = clientRepository;
        this.walletService = walletService;
        this.walletRepository = walletRepository;
    }

    @Override
    public Optional<Client> addClient(ClientDto clientDto) {

        Client client = ClientMapper.mapClientDtoToClient(clientDto);
        Wallet wallet = walletService.createWallet(clientDto);

        wallet.setClient(client);
        client.setWallet(wallet);

        Optional<Client> savedClient = Optional.of(clientRepository.save(client));
        Optional<Wallet> savedWallet = Optional.of(walletRepository.save(wallet));
        savedClient.get().setWallet(savedWallet.get());

        if(savedClient.isPresent()){
            return savedClient;
        } else {
            return Optional.empty();
        }
    }

    @Override
    public Optional<List<Client>> findClientByLogin(String login) {
        Iterable<Client> clientsList = clientRepository.findAll();
        List<Client> finalList = new ArrayList<>();
        for(Client client : clientsList) {
            if(client.getLogin().equals(login)){
                finalList.add(client);
            }
        }
        if(finalList.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(finalList);
    }
}
