package com.example.blockchainsimulation.controllers;

import com.example.blockchainsimulation.domain.BlockInfoDto;
import com.example.blockchainsimulation.domain.TransactionDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class TransactionController {

    @PostMapping("/addTransaction")
    public ResponseEntity<String> addTransaction(@RequestBody TransactionDto transactionDto) {
        return ResponseEntity.ok().body("Added transaction");
    }

    @GetMapping
    public ResponseEntity<Integer> getTotalBalance() {
        return ResponseEntity.ok().body(1000);
    }

    @GetMapping
    public ResponseEntity<BlockInfoDto> getLastBlockNumber() {
        return ResponseEntity.ok().body(new BlockInfoDto());
    }

    @GetMapping
    public ResponseEntity<Integer> getNumberOfTransactions() {
        return ResponseEntity.ok().body(1234);
    }

    @GetMapping("/showTransactionByWalletAddress/{address}")
    public ResponseEntity<Integer> showTransactionByWallerAddress(@PathVariable String address) {
        return ResponseEntity.ok().body(1234);
    }

}
