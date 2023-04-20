package com.example.blockchainsimulation.transaction.service;

import com.example.blockchainsimulation.transaction.data.Transaction;
import com.example.blockchainsimulation.transaction.data.TransactionDto;
import com.example.blockchainsimulation.transaction.mapper.TransactionMapper;
import com.example.blockchainsimulation.transaction.repository.TransactionRepository;
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
