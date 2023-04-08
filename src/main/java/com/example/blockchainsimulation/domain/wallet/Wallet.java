package com.example.blockchainsimulation.domain.wallet;

import com.example.blockchainsimulation.domain.transaction.Transaction;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
    @OneToMany(mappedBy = "transactions")
    private List<Transaction> transactionList = new ArrayList<Transaction>();

}
