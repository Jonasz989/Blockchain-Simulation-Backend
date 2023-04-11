package com.example.blockchainsimulation.domain.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Transaction {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    @Size(min = 1)
    private String name;
    @NotNull
    @Min(0)
    private BigDecimal value;
    @Past
    @NotNull
    private LocalDateTime date;
    @NotNull
    @Size(min = 1)
    private String description;
    @NotNull
    @Size(min = 1)
    private String receiver;
    @NotNull
    @Size(min = 1)
    private String sender;
    @ManyToOne
    @JoinColumn(name = "wallet_id")
    private Wallet wallet;

    @ManyToOne
    @JoinColumn(name = "block_id")
    private Block block;
}
