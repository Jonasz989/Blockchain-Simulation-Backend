package com.example.blockchainsimulation.wallet.mapper;

import com.example.blockchainsimulation.client.mapper.ClientMapper;
import com.example.blockchainsimulation.wallet.data.Wallet;
import com.example.blockchainsimulation.wallet.data.WalletDto;

import java.util.Optional;

public class WalletMapper {

    public static Wallet mapWalletDtoToWallet(WalletDto walletDto) {
        Wallet wallet = new Wallet();
        wallet.setClientUUID(walletDto.getClientUUID());
        wallet
                .setClient(ClientMapper
                        .mapClientDtoToClient(walletDto.getClientDto()));
        wallet.setWalletUUID(walletDto.getWalletUUID());
        wallet.setTransactionList(walletDto.getTransactions());
        return wallet;
    }

    public static WalletDto mapWalletToWalletDto(Wallet wallet) {
        WalletDto walletDto = new WalletDto();
        walletDto.setClientUUID(wallet.getClientUUID());
        walletDto
                .setClientDto(
                        ClientMapper.mapClientToClientDto(wallet.getClient()));
        walletDto.setWalletUUID(wallet.getWalletUUID());
        walletDto.setTransactions(wallet.getTransactionList());
        return walletDto;
    }

    public static Wallet mapOptionalWalletDtoToWallet(Optional<WalletDto> walletDto) {
        return mapWalletDtoToWallet(walletDto.get());
    }

    public static WalletDto mapOptionalWalletToWalletDto(Optional<Wallet> wallet) {
        return mapWalletToWalletDto(wallet.get());
    }

}
