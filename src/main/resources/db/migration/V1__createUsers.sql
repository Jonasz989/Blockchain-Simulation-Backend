CREATE TABLE clients
(
    id         SERIAL PRIMARY KEY,
    clientUUID VARCHAR(255) NOT NULL,
    login      VARCHAR(255) NOT NULL,
    password   VARCHAR(255) NOT NULL,
    walletUUID VARCHAR(128) NOT NULL,
    wallet_id  BIGINT REFERENCES wallets (id) ON DELETE CASCADE
);
--
--
-- INSERT INTO USERS (useruuid, login,password, walletUUID, wallet_id)
-- VALUES ('10000','Damian','Damian1', '100',1),
--        ('10000','John','John1', '200',2),
--        ('10000', 'Mary','Mary1', '300',3),
--        ('10000','Peter','Peter1', '400',4),
--        ('10000','Sara','Sara1', '500',5);
--

