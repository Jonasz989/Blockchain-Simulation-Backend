package com.example.blockchainsimulation.services.impl;

import com.example.blockchainsimulation.domain.data.Transaction;
import com.example.blockchainsimulation.domain.data.Wallet;
import com.example.blockchainsimulation.repositories.WalletRepository;
import com.example.blockchainsimulation.services.WalletService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class WalletImpl implements WalletService {
    private final WalletRepository walletRepository;

    public WalletImpl(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    @Override
    public Optional<Wallet> findWalletByUUID(String uuid) {
        Iterable<Wallet> wallets = walletRepository.findAll();
        for(Wallet wallet :wallets){
            if(wallet.getWalletUUID().equals(uuid)){
                return Optional.of(wallet);
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<Iterable<Wallet>> findAll() {
        Optional<Iterable<Wallet>> walletList = Optional.of(walletRepository.findAll());
        if (walletList.isPresent()){
            return walletList;
        }else {
            return Optional.empty();
        }
    }

    @Override
    public BigDecimal getTotalBalance() {
        Iterable<Wallet> wallets = walletRepository.findAll();
        BigDecimal total = new BigDecimal(0);
        for(Wallet w : wallets) {
            BigDecimal currentValue = new BigDecimal(0);
            for(Transaction tx : w.getTransactionList()) {
                currentValue = currentValue.add(tx.getValue());
            }
            total = total.add(currentValue);
        }
        return total;
    }
}
