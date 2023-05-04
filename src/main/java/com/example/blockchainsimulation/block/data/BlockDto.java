package com.example.blockchainsimulation.block.data;

import com.example.blockchainsimulation.transaction.data.Transaction;
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
