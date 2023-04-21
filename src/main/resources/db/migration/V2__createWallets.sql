CREATE TABLE wallets
(
    id         SERIAL PRIMARY KEY,
    walletUUID VARCHAR(36) NOT NULL,
    client_id  BIGINT REFERENCES clients (id),
    clientUUID VARCHAR(36) NOT NULL
);

-- insert into Wallet (id, wallet_uuid, client, user_id, listOfTransactions)
-- values (1,'100', ,,ARRAY ['1', '2']),
--        (2,'200', ,,ARRAY ['3', '4']),
--        (3,'300', ,,ARRAY ['5', '6']),
--        (4,'400', ,,ARRAY ['7', '8']),
--        (5,'500', ,,ARRAY ['9', '10']);