package com.example.blockchainsimulation.controllers;

import com.example.blockchainsimulation.domain.block.Block;
import com.example.blockchainsimulation.domain.transaction.TransactionDto;
import com.example.blockchainsimulation.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class TransactionController {

    private final TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping("/addTransaction")
    public ResponseEntity<String> addTransaction(@RequestBody TransactionDto transactionDto) {
        return ResponseEntity.ok().body("Added transaction");
    }

    @GetMapping
    public ResponseEntity<Integer> getTotalBalance() {
        return ResponseEntity.ok().body(1000);
    }

    @GetMapping
    public ResponseEntity<Block> getLastBlockNumber() {
        return ResponseEntity.ok().body(new Block());
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
