package com.example.blockchainsimulation.services.impl;

import com.example.blockchainsimulation.domain.data.Block;
import com.example.blockchainsimulation.domain.data.Transaction;
import com.example.blockchainsimulation.domain.data.Wallet;
import com.example.blockchainsimulation.domain.dto.TransactionDto;
import com.example.blockchainsimulation.domain.mapper.TransactionMapper;
import com.example.blockchainsimulation.repositories.TransactionRepository;
import com.example.blockchainsimulation.services.TransactionService;
import com.example.blockchainsimulation.services.WalletService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
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
    public Long getNumberOfTransactions() {
        Optional<Iterable<Transaction>> transactions = Optional.of(transactionRepository.findAll());
        if (transactions.isPresent()) {
            Transaction lastTransaction = new Transaction();
            while(transactions.get().iterator().hasNext()){
                lastTransaction = transactions.get().iterator().next();
            }
            return lastTransaction.getId();
        }
        return 0L;
    }

    @Override
    public Integer getTransactionByWalletAddress(String address) {
        return null;
    }
}
