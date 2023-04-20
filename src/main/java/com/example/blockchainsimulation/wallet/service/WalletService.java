package com.example.blockchainsimulation.wallet.service;

import com.example.blockchainsimulation.wallet.data.Wallet;
import com.example.blockchainsimulation.wallet.data.WalletDto;

import java.math.BigDecimal;
import java.util.Optional;

public interface WalletService {

    Optional<Wallet> findWalletByUUID(String uuid);

    Optional<Iterable<Wallet>> findAll();

    BigDecimal getTotalBalance();

    Optional<WalletDto> save(WalletDto dto);
}
