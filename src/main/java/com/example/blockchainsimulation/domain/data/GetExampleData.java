package com.example.blockchainsimulation.domain.data;

import com.example.blockchainsimulation.block.data.Block;
import com.example.blockchainsimulation.block.data.BlockHeader;
import com.example.blockchainsimulation.client.data.Client;
import com.example.blockchainsimulation.transaction.data.Transaction;
import com.example.blockchainsimulation.wallet.data.Wallet;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class GetExampleData {
    private static UUID uuid = UUID.fromString("e58ed763-928c-4155-bee9-fdbaaadc15f3");
    private static String name = "Igor";
    private static Wallet wallet = new Wallet();
    private static Long id = 1L;
    private static String description = "example description";
    private static String transactionName = "first transaction";
    private static LocalDateTime localDateTime = LocalDateTime.of(1997,07,22,00,00);
    private static BigDecimal value = BigDecimal.valueOf(1L);
    private static String receiver = "Damian";
    private static String sender = "Tomasz";
    private static String username = "username";
    private static UUID walletUUID = UUID.fromString("55aa48f8-1270-467d-adfc-18b1a369ed95");
    private static String password = "password";
    private static String blockHash = "1085bd5a-e216-48bd-8b7e-84591996324e";
    private static int blockchainVersion = 1;
    private static int difficultyTarget = 5;
    private static String merkleRoot = "ba7816bf8f01cfea414140de5dae2223b00361a396177a9cb410ff61f20015ad";
    private static int nonce = 34567;
    private static String previousBlockHeaderHash = "0xd869185d9321dcd86c671d03777775f13c090bccd1487b7ef1f138957676ff17";

    public static Wallet createWallet(){
        Wallet wallet = new Wallet();
        wallet.setId(id);
        wallet.setClientUUID(uuid.toString());
        //wallet.setTransactionList(transactionList());
        return wallet;
    }
    public static List<Transaction> transactionList(){
        List<Transaction> list = new ArrayList<Transaction>();
        list.add(createTransaction());
        list.add(createTransaction());
        list.add(createTransaction());
        return list;
    }
    public static Transaction createTransaction(){
        Transaction transaction = new Transaction();
        transaction.setId(id);
        transaction.setDescription(description);
        transaction.setName(transactionName);
        transaction.setDate(localDateTime);
        transaction.setValue(value);
        transaction.setReceiver(receiver);
        transaction.setSender(sender);
        return transaction;
    }
    public static Client createUser(){
        Client client = new Client();
        client.setId(id);
        client.setClientUUID(uuid.toString());
        client.setLogin(username);
        client.setWalletUUID(walletUUID.toString());
        client.setPassword(password);
        return client;
    }
    public static Block createBlock(){
        Block block = new Block();
        block.setId(id);
        block.setBlockHash(blockHash);
        //block.setTransactionList(transactionList());
        block.setBlockChainVersion(blockchainVersion);
        block.setTimeOfCreation(localDateTime);
        return block;
    }
    public static BlockHeader createBlockHeader(){
        BlockHeader blockHeader = new BlockHeader();
        blockHeader.setLocalDateTime(localDateTime);
        blockHeader.setDifficultyTarget(difficultyTarget);
        blockHeader.setMerkleRoot(merkleRoot);
        blockHeader.setNonce(nonce);
        blockHeader.setPreviousBlockHeaderHash(previousBlockHeaderHash);
        return blockHeader;
    }
}
