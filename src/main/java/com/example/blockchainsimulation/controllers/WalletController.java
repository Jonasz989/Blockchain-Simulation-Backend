package com.example.blockchainsimulation.controllers;

import com.example.blockchainsimulation.domain.data.Transaction;
import com.example.blockchainsimulation.domain.data.Wallet;
import com.example.blockchainsimulation.domain.dto.WalletDto;
import com.example.blockchainsimulation.domain.mapper.WalletMapper;
import com.example.blockchainsimulation.repositories.TransactionRepository;
import com.example.blockchainsimulation.services.WalletService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class WalletController {
    private final WalletService walletService;
    private final TransactionRepository transactionRepository;

    public WalletController(WalletService walletService,
                            TransactionRepository transactionRepository) {
        this.walletService = walletService;
        this.transactionRepository = transactionRepository;
    }

    @GetMapping("/findWallet/{uuid}")
    public ResponseEntity<WalletDto> findWalletByUUID(@PathVariable String uuid){
        Optional<Wallet> wallet = walletService.findWalletByUUID(uuid);
        if(wallet.isPresent()){
            return ResponseEntity
                    .ok(WalletMapper.mapOptionalWalletToWalletDto(wallet));
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/findWallet/all")
    public ResponseEntity<List<WalletDto>> findAllWallet(@PathVariable String uuid){
        Optional<Iterable<Wallet>> wallets = walletService.findAll();

        if(wallets.isPresent()){
            List<WalletDto> walletsList = new ArrayList<>();
            for(Wallet wallet : wallets.get()){
                walletsList.add(WalletMapper.mapWalletToWalletDto(wallet));
            }
            return ResponseEntity
                    .ok(walletsList);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/showTransactionsByWalletAddress/{uuid}")
    public ResponseEntity<List<Transaction>> showTransactionsByWalletUUID(@PathVariable String uuid) {
        Optional<Wallet> walletOptional = walletService.findWalletByUUID(uuid);
        if(walletOptional.isPresent()) {
            return ResponseEntity.ok(walletOptional.get().getTransactionList());
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/totalBalance")
    public ResponseEntity<BigDecimal> getTotalBalance() {
        return ResponseEntity.ok(walletService.getTotalBalance());
    }
}
