package com.example.blockchainsimulation.transaction.service;

import com.example.blockchainsimulation.block.service.BlockServiceImpl;
import com.example.blockchainsimulation.transaction.data.Transaction;
import com.example.blockchainsimulation.transaction.data.TransactionDto;
import com.example.blockchainsimulation.transaction.mapper.TransactionMapper;
import com.example.blockchainsimulation.transaction.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;


@Service
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;
    private final BlockServiceImpl blockService;

    public TransactionServiceImpl(TransactionRepository transactionRepository, BlockServiceImpl blockService) {
        this.transactionRepository = transactionRepository;
        this.blockService = blockService;
    }

    @Override
    public Optional<Transaction> addTransaction(TransactionDto transactionDto) {

        blockService.createBlock();

        Transaction transaction = TransactionMapper.mapTransactionDtoToTransaction(transactionDto);
        Optional<Transaction> optionalTransaction = Optional.of(transactionRepository.save(transaction));
        return optionalTransaction;
    }

    @Override
    public Long getNumberOfTransactions() {
        Optional<Iterable<Transaction>> transactions = Optional.of(transactionRepository.findAll());
        if (transactions.isPresent()) {
            Transaction lastTransaction = new Transaction();
            for(Transaction transaction : transactions.get()){
                lastTransaction = transaction;
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
