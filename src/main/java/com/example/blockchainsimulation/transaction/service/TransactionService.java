package com.example.blockchainsimulation.transaction.service;

import com.example.blockchainsimulation.transaction.data.Transaction;
import com.example.blockchainsimulation.transaction.data.TransactionDto;

import java.math.BigDecimal;
import java.util.Optional;

public interface TransactionService {

    Optional<Transaction> addTransaction(TransactionDto transactionDto);


    Long getNumberOfTransactions();

    Integer getTransactionByWalletAddress(String address);

}
