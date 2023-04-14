package com.example.blockchainsimulation.domain.data;

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
//    @Column(name = "wallet_id")
    private Long id;

//    @Column(name = "wallet_uuid")
    private String walletUUID;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;
    @Size(min = 36, max = 36, message = "Incorrect user uuid")
//    @Column(name = "user_uuid")
    private String userUUID = user.getUserUUID();

    @OneToMany(mappedBy = "wallet",fetch = FetchType.LAZY)
//    @Column(name = "transactions_list")
    private List<Transaction> transactionList = new ArrayList<Transaction>();

}
