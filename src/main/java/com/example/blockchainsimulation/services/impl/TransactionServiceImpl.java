package com.example.blockchainsimulation.services.impl;

import com.example.blockchainsimulation.domain.data.Block;
import com.example.blockchainsimulation.domain.dto.TransactionDto;
import com.example.blockchainsimulation.repositories.TransactionRepository;
import com.example.blockchainsimulation.services.TransactionService;
import org.springframework.stereotype.Service;


@Service
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public boolean addTransaction(TransactionDto transactionDto) {
        return false;
    }

    @Override
    public Integer getTotalBalance() {
        return null;
    }

    @Override
    public Block getLastBlockInfo() {
        return null;
    }

    @Override
    public Integer getNumberOfTransactions() {
        return null;
    }

    @Override
    public Integer getTransactionByWalletAddress(String address) {
        return null;
    }
}
