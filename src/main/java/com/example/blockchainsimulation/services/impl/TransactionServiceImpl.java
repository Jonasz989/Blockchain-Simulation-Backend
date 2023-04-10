package com.example.blockchainsimulation.services.impl;

import com.example.blockchainsimulation.domain.data.Block;
import com.example.blockchainsimulation.domain.data.Transaction;
import com.example.blockchainsimulation.domain.dto.TransactionDto;
import com.example.blockchainsimulation.domain.mapper.TransactionMapper;
import com.example.blockchainsimulation.repositories.TransactionRepository;
import com.example.blockchainsimulation.services.TransactionService;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public Optional<Transaction> addTransaction(TransactionDto transactionDto) {
        Transaction transaction = TransactionMapper.mapTransactionDtoToTransaction(transactionDto);
        Optional<Transaction> optionalTransaction = Optional.of(transactionRepository.save(transaction));
        return optionalTransaction;
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
