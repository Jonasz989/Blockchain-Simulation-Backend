package com.example.blockchainsimulation.repositories;

import com.example.blockchainsimulation.domain.data.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {
}
