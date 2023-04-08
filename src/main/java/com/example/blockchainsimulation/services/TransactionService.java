package com.example.blockchainsimulation.services;

import com.example.blockchainsimulation.domain.block.Block;
import com.example.blockchainsimulation.domain.transaction.TransactionDto;

public interface TransactionService {

    boolean addTransaction(TransactionDto transactionDto);

    Integer getTotalBalance();

    Block getLastBlockInfo();

    Integer getNumberOfTransactions();

    Integer getTransactionByWalletAddress(String address);

}
