package com.example.blockchainsimulation.controllers;

import com.example.blockchainsimulation.domain.data.Block;
import com.example.blockchainsimulation.domain.dto.TransactionDto;
import com.example.blockchainsimulation.services.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/app/blockchain")
@RestController
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping("/addTransaction")
    public ResponseEntity<String> addTransaction(@RequestBody TransactionDto transactionDto) {
        return ResponseEntity.ok().body("Added transaction");
    }

    @GetMapping("/totalBalance")
    public ResponseEntity<Integer> getTotalBalance() {
        return ResponseEntity.ok().body(1000);
    }

    @GetMapping("/lastBlockNumber")
    public ResponseEntity<Block> getLastBlockNumber() {
        return ResponseEntity.ok().body(new Block());
    }

    @GetMapping("/transactions/amount")
    public ResponseEntity<Integer> getNumberOfTransactions() {
        return ResponseEntity.ok().body(1234);
    }

    @GetMapping("/showTransactionByWalletAddress/{address}")
    public ResponseEntity<Integer> showTransactionByWalletAddress(@PathVariable String address) {
        return ResponseEntity.ok().body(1234);
    }

}
