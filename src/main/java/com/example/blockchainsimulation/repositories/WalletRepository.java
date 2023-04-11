package com.example.blockchainsimulation.repositories;

import com.example.blockchainsimulation.domain.data.Wallet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletRepository extends CrudRepository<Wallet, Long> {
}
