package com.example.blockchainsimulation.transaction.controller;

import com.example.blockchainsimulation.transaction.data.Transaction;
import com.example.blockchainsimulation.transaction.data.TransactionDto;
import com.example.blockchainsimulation.transaction.service.TransactionService;
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
