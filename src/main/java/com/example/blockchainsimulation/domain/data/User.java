package com.example.blockchainsimulation.domain.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.Size;

//add annotation for login if exists
//add annotation for password if exists



@Entity
@Getter
@Setter
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @GeneratedValue(strategy = GenerationType.UUID)
    private String userUUID;
    @NotNull
    @Size(min =1)
    private String login;
    @NotNull
    @Size(min =1)
    private String password;
    @NotNull
    @Size(min = 36, max = 36, message = "Invalid wallet id")
    private String walletUUID;
    @OneToOne(mappedBy = "walletUUID")
    private Wallet wallet;
}
