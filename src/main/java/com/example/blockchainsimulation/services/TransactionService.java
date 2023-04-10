package com.example.blockchainsimulation.services;

import com.example.blockchainsimulation.domain.data.Block;
import com.example.blockchainsimulation.domain.data.Transaction;
import com.example.blockchainsimulation.domain.dto.TransactionDto;

import java.util.Optional;

public interface TransactionService {

    Optional<Transaction> addTransaction(TransactionDto transactionDto);

    Integer getTotalBalance();

    Block getLastBlockInfo();

    Integer getNumberOfTransactions();

    Integer getTransactionByWalletAddress(String address);

}
