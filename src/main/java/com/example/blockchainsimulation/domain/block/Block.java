package com.example.blockchainsimulation.domain.block;

import com.example.blockchainsimulation.domain.transaction.Transaction;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Block {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private LocalDateTime timeOfCreation;
    @NotNull
    @Size(min = 1)
    private Integer blockChainVersion;
    @NotNull
    @Size(min = 64, max = 64)
    private String blockHash;
    @NotNull
    @OneToMany(mappedBy = "transactions")
    List<Transaction> transactionList = new ArrayList<>();
}
