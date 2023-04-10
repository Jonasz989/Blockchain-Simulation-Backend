CREATE TABLE users
(
    id       SERIAL PRIMARY KEY,
    useruuid VARCHAR(255) NOT NULL,
    login VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    walletUUID VARCHAR(128) NOT NULL
);


INSERT INTO USERS (useruuid, login,password, walletUUID)
VALUES ('10000','Damian','Damian1', '100'),
       ('10000','John','John1', '200'),
       ('10000', 'Mary','Mary1', '300'),
       ('10000','Peter','Peter1', '400'),
       ('10000','Sara','Sara1', '500');


