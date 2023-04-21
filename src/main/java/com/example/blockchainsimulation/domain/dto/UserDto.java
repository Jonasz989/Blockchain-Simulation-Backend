package com.example.blockchainsimulation.domain.dto;

import com.example.blockchainsimulation.domain.data.Wallet;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class UserDto {

    private String userUUID;

    private String login;
    private String password;
    private String walletUUID;
    private WalletDto walletDto;

    @Override
    public String toString() {
        return "UserDto{" +
                "userUUID='" + userUUID + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", walletUUID='" + walletUUID + '\'' +
                '}';
    }
}
