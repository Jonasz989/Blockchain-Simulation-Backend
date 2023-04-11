package com.example.blockchainsimulation.domain.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Block {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private LocalDateTime timeOfCreation;
    @NotNull
    @Size(min = 1)
    private Integer blockChainVersion;
    @NotNull
    @Size(min = 64, max = 64)
    private String blockHash;

    @OneToMany
    @JoinColumn(name = "block_id")
    private List<Transaction> transactions = new ArrayList<>();

}
