package com.example.blockchainsimulation.wallet.data;

import com.example.blockchainsimulation.client.data.Client;
import com.example.blockchainsimulation.transaction.data.Transaction;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "wallets")
@Getter
@Setter
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String walletUUID;
    @OneToOne()
    @JoinColumn(name = "client_id")
    private Client client;
    @Size(min = 36, max = 36, message = "Incorrect client uuid")
    private String clientUUID;

    @OneToMany(mappedBy = "wallet",fetch = FetchType.LAZY)
    private List<Transaction> transactionList = new ArrayList<Transaction>();

}
