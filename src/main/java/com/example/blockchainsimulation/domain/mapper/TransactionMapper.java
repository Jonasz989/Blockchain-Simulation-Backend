package com.example.blockchainsimulation.domain.mapper;

import com.example.blockchainsimulation.domain.data.Transaction;
import com.example.blockchainsimulation.domain.dto.TransactionDto;

import java.util.Optional;

public class TransactionMapper {
    public static Transaction mapTransactionDtoToTransaction(TransactionDto transactionDto){

        Transaction transaction = new Transaction();

        transaction.setSender(transactionDto.getSender());
        transaction.setValue(transactionDto.getValue());
        transaction.setName(transactionDto.getName());
        transaction.setReceiver(transactionDto.getReceiver());
        transaction.setDate(transactionDto.getDate());
        transaction.setDescription(transactionDto.getDescription());
        return transaction;
    }

    public static TransactionDto mapTransactionToTransactionDto(Transaction transaction){
        TransactionDto transactionDto = new TransactionDto();

        transactionDto.setSender(transaction.getSender());
        transactionDto.setValue(transaction.getValue());
        transactionDto.setName(transaction.getName());
        transactionDto.setReceiver(transaction.getReceiver());
        transactionDto.setDate(transaction.getDate());
        transactionDto.setDescription(transaction.getDescription());

        return transactionDto;
    }

    public static TransactionDto mapOptionalTransactionToTransactionDto(Optional<Transaction> transaction) {
        return mapTransactionToTransactionDto(transaction.get());
    }

    public static Transaction mapOptionalTransactionDtoToTransaction(Optional<TransactionDto> transactionDto) {
        return mapTransactionDtoToTransaction(transactionDto.get());
    }
}
