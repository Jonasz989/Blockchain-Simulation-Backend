package com.example.blockchainsimulation.domain.dto;

import com.example.blockchainsimulation.domain.data.Transaction;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class WalletDto {

    private String walletUUID;
    private UserDto userDto;
    private String userId;

    private List<Transaction> transactions = new ArrayList<>();
}
