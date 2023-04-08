package com.example.blockchainsimulation.domain.wallet;

import com.example.blockchainsimulation.domain.transaction.Transaction;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

public class WalletDto {
    private String userId;
    private List<Transaction> transactionList = new ArrayList<Transaction>();
}
