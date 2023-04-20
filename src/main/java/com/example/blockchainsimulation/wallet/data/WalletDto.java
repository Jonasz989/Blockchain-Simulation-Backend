package com.example.blockchainsimulation.wallet.data;

import com.example.blockchainsimulation.transaction.data.Transaction;
import com.example.blockchainsimulation.client.data.ClientDto;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class WalletDto {

    private String walletUUID;

    private ClientDto clientDto;

    private String clientUUID;

    private List<Transaction> transactions = new ArrayList<>();

    @Override
    public String toString() {
        return "WalletDto{" +
                "walletUUID='" + walletUUID + '\'' +
                ", clientUUID='" + clientUUID + '\'' +
                ", transactions=" + transactions +
                '}';
    }
}
