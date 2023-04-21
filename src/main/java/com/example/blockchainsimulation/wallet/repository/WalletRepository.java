package com.example.blockchainsimulation.wallet.repository;

import com.example.blockchainsimulation.wallet.data.Wallet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletRepository extends CrudRepository<Wallet, Long> {
}
