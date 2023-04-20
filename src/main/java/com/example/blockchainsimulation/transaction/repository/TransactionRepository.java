package com.example.blockchainsimulation.transaction.repository;

import com.example.blockchainsimulation.transaction.data.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {
}
