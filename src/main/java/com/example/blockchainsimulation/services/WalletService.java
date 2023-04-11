package com.example.blockchainsimulation.services;

import com.example.blockchainsimulation.domain.data.Wallet;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface WalletService {
    Optional<Wallet> findWalletByUUID(String uuid);
    Optional<Iterable<Wallet>> findAll();

    BigDecimal getTotalBalance();
}
