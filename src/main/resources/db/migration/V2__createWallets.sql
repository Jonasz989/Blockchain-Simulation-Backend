CREATE TABLE wallets
(
    address            varchar(128)   NOT NULL,
    listOfTransactions varchar(128)[] NOT NULL,
    balance            int            NOT NULL,
    PRIMARY KEY (address)
);

insert into wallets (address, listOfTransactions, balance)
values ('100', ARRAY ['1', '2'], 100),
       ('200', ARRAY ['3', '4'], 200),
       ('300', ARRAY ['5', '6'], 300),
       ('400', ARRAY ['7', '8'], 400),
       ('500', ARRAY ['9', '10'], 500);