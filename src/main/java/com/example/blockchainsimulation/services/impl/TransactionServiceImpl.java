package com.example.blockchainsimulation.services.impl;

import com.example.blockchainsimulation.domain.block.Block;
import com.example.blockchainsimulation.domain.transaction.TransactionDto;
import com.example.blockchainsimulation.services.TransactionService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class TransactionServiceImpl implements TransactionService {

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
