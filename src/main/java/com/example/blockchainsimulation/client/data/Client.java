package com.example.blockchainsimulation.client.data;

import com.example.blockchainsimulation.wallet.data.Wallet;
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
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String clientUUID;
    @NotNull
    @Size(min =1)
    private String login;
    @NotNull
    @Size(min =1)
    private String password;
    @NotNull
    @Size(min = 36, max = 36, message = "Invalid wallet id")
    private String walletUUID;
    @OneToOne(mappedBy = "client")
    private Wallet wallet;
}
