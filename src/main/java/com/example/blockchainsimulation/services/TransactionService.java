package com.example.blockchainsimulation.services;

import com.example.blockchainsimulation.domain.data.Block;
import com.example.blockchainsimulation.domain.dto.TransactionDto;

public interface TransactionService {

    boolean addTransaction(TransactionDto transactionDto);

    Integer getTotalBalance();

    Block getLastBlockInfo();

    Integer getNumberOfTransactions();

    Integer getTransactionByWalletAddress(String address);

}
