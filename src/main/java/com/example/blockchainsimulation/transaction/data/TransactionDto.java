package com.example.blockchainsimulation.transaction.data;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class TransactionDto {

    private String name;

    private BigDecimal value;

    private String description;

    private LocalDateTime date;

    private String receiver;

    private String sender;
}
