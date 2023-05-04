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

    private static UUID UUID_EXAMPLE = UUID.fromString("e58ed763-928c-4155-bee9-fdbaaadc15f3");

    private static String NAME = "Igor";

    private static Wallet WALLET = new Wallet();

    private static Long ID = 1L;
    private static String DESCRIPTION = "example description";

    private static String TRANSACTION_NAME = "first transaction";

    private static LocalDateTime LOCAL_DATE_TIME = LocalDateTime.of(1997,07,22,00,00);

    private static BigDecimal VALUE = BigDecimal.valueOf(1L);

    private static String RECEIVER = "Damian";

    private static String SENDER = "Tomasz";

    private static String USERNAME = "username";

    private static UUID WALLET_ID = UUID.fromString("55aa48f8-1270-467d-adfc-18b1a369ed95");

    private static String PASSWORD = "password";

    private static String BLOCK_HASH = "1085bd5a-e216-48bd-8b7e-84591996324e";

    private static int BLOCKCHAIN_VERSION = 1;

    private static int DIFFICULTY_TARGET = 5;

    private static String MERKLE_ROOT = "ba7816bf8f01cfea414140de5dae2223b00361a396177a9cb410ff61f20015ad";

    private static int NONCE = 34567;

    private static String PREVIOUS_BLOCK_HEADER_HASH = "0xd869185d9321dcd86c671d03777775f13c090bccd1487b7ef1f138957676ff17";


    public static Wallet createWallet(){
        Wallet wallet = new Wallet();
        wallet.setId(ID);
        wallet.setClientUUID(UUID_EXAMPLE.toString());
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
        transaction.setId(ID);
        transaction.setDescription(DESCRIPTION);
        transaction.setName(TRANSACTION_NAME);
        transaction.setDate(LOCAL_DATE_TIME);
        transaction.setValue(VALUE);
        transaction.setReceiver(RECEIVER);
        transaction.setSender(SENDER);
        return transaction;
    }

    public static Client createUser(){
        Client client = new Client();
        client.setId(ID);
        client.setClientUUID(UUID_EXAMPLE.toString());
        client.setLogin(USERNAME);
        client.setWalletUUID(WALLET_ID.toString());
        client.setPassword(PASSWORD);
        return client;
    }

    public static Block createBlock(){
        Block block = new Block();
        block.setId(ID);
        block.setBlockHash(BLOCK_HASH);
        //block.setTransactionList(transactionList());
        block.setBlockChainVersion(BLOCKCHAIN_VERSION);
        block.setTimeOfCreation(LOCAL_DATE_TIME);
        return block;
    }

    public static BlockHeader createBlockHeader(){
        BlockHeader blockHeader = new BlockHeader();
        blockHeader.setLocalDateTime(LOCAL_DATE_TIME);
        blockHeader.setDifficultyTarget(DIFFICULTY_TARGET);
        blockHeader.setMerkleRoot(MERKLE_ROOT);
        blockHeader.setNonce(NONCE);
        blockHeader.setPreviousBlockHeaderHash(PREVIOUS_BLOCK_HEADER_HASH);
        return blockHeader;
    }
}
