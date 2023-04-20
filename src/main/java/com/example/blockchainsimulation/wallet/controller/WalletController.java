package com.example.blockchainsimulation.wallet.controller;

import com.example.blockchainsimulation.transaction.data.Transaction;
import com.example.blockchainsimulation.transaction.repository.TransactionRepository;
import com.example.blockchainsimulation.wallet.data.Wallet;
import com.example.blockchainsimulation.wallet.data.WalletDto;
import com.example.blockchainsimulation.wallet.mapper.WalletMapper;
import com.example.blockchainsimulation.wallet.service.WalletService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("createWallet")
    public ResponseEntity<WalletDto> createWallet(@RequestBody WalletDto dto) {
        Optional<WalletDto> walletDto = walletService.save(dto);
        return ResponseEntity.ok().body(walletDto.get());
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
//            return ResponseEntity.ok(walletOptional.get().getTransactionList());
            return ResponseEntity.ok(List.of());
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/totalBalance")
    public ResponseEntity<BigDecimal> getTotalBalance() {
        return ResponseEntity.ok(walletService.getTotalBalance());
    }
}
