package com.example.blockchainsimulation.controllers;

import com.example.blockchainsimulation.domain.data.Block;
import com.example.blockchainsimulation.domain.data.Transaction;
import com.example.blockchainsimulation.domain.dto.TransactionDto;
import com.example.blockchainsimulation.services.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/app/blockchain")
@RestController
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping("/addTransaction")
    public ResponseEntity<TransactionDto> addTransaction(@RequestBody TransactionDto transactionDto) {
        Optional<Transaction> optionalTransaction = transactionService.addTransaction(transactionDto);
        if(optionalTransaction.isPresent()) {
            return ResponseEntity.ok().body(transactionDto);
        }else {
            return ResponseEntity.notFound().build();
        }
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
