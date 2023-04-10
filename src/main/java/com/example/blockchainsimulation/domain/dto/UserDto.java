package com.example.blockchainsimulation.domain.dto;

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
