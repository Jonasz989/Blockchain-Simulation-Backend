package com.example.blockchainsimulation.services;

import com.example.blockchainsimulation.domain.BlockInfoDto;
import com.example.blockchainsimulation.domain.TransactionDto;

public interface TransactionService {

    boolean addTransaction(TransactionDto transactionDto);

    Integer getTotalBalance();

    BlockInfoDto getLastBlockInfo();

    Integer getNumberOfTransactions();

    Integer getTransactionByWalletAddress(String address);

}
