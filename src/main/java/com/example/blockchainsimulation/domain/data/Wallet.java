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
    @GeneratedValue
    private Long id;
    @Size(min = 36, max = 36, message = "Incorrect user id")
    private String userId;
//    @OneToMany(mappedBy = "transactions")
//    private List<Transaction> transactionList = new ArrayList<Transaction>();

}
