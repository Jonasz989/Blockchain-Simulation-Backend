package com.example.blockchainsimulation.domain.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Wallet")
@Getter
@Setter
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @GeneratedValue(strategy = GenerationType.UUID)
    private String walletUUID;
    @OneToOne(mappedBy = "userUUID")
    private User user;
    @Size(min = 36, max = 36, message = "Incorrect user id")
    private String userId = user.getUserUUID();

    @OneToMany(mappedBy = "wallet")
    @JoinColumn(name = "wallet_id")
    private List<Transaction> transactionList = new ArrayList<Transaction>();

}
