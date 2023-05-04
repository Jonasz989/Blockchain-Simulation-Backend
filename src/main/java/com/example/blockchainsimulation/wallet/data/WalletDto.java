package com.example.blockchainsimulation.wallet.data;

import com.example.blockchainsimulation.client.data.ClientDto;
import com.example.blockchainsimulation.transaction.data.Transaction;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class WalletDto {

    private String walletUUID;

    private ClientDto clientDto;

    private String clientId;

    private List<Transaction> transactions = new ArrayList<>();
}
