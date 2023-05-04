package com.example.blockchainsimulation.client.data;

import com.example.blockchainsimulation.wallet.data.WalletDto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientDto {

    private String clientUUID;

    private String login;

    private String password;

    private String walletUUID;

    private WalletDto walletDto;


    @Override
    public String toString() {
        return "UserDto{" +
                "userUUID='" + clientUUID + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", walletUUID='" + walletUUID + '\'' +
                '}';
    }
}
