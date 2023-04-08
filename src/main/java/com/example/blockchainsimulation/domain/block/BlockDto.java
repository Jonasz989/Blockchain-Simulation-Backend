package com.example.blockchainsimulation.domain.block;

import com.example.blockchainsimulation.domain.transaction.Transaction;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class BlockDto {
    private LocalDateTime timeOfCreation;
    private Integer blockchainVersion;
    private String blockHash;
    private List<Transaction> transactionList = new ArrayList<>();

}
