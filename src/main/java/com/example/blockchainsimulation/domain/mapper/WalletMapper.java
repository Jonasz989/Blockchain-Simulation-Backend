package com.example.blockchainsimulation.domain.mapper;

import com.example.blockchainsimulation.domain.data.User;
import com.example.blockchainsimulation.domain.data.Wallet;
import com.example.blockchainsimulation.domain.dto.UserDto;
import com.example.blockchainsimulation.domain.dto.WalletDto;

import java.util.Optional;

public class WalletMapper {
    public static Wallet mapWalletDtoToWallet(WalletDto walletDto) {
        Wallet wallet = new Wallet();
        wallet.setUserUUID(walletDto.getUserId());
        wallet
                .setUser(UserMapper
                        .mapUserDtoToUser(walletDto.getUserDto()));
        wallet.setWalletUUID(walletDto.getWalletUUID());
        wallet.setTransactionList(walletDto.getTransactions());
        return wallet;
    }

    public static WalletDto mapWalletToWalletDto(Wallet wallet) {
        WalletDto walletDto = new WalletDto();
        walletDto.setUserId(wallet.getUserUUID());
        walletDto
                .setUserDto(
                        UserMapper.mapUserToUserDto(wallet.getUser()));
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
