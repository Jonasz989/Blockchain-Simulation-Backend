package com.example.blockchainsimulation.controllers;

import com.example.blockchainsimulation.domain.data.Block;
import com.example.blockchainsimulation.domain.data.Transaction;
import com.example.blockchainsimulation.domain.data.Wallet;
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

    @GetMapping("/transactions/amount")
    public ResponseEntity<Long> getNumberOfTransactions() {
        return ResponseEntity.ok(transactionService.getNumberOfTransactions());
    }

}
