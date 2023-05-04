CREATE TABLE users
(
    id       SERIAL PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    wallet VARCHAR(128) NOT NULL
);


INSERT INTO USERS (username, wallet)
VALUES ('Damian', '100'),
       ('John', '200'),
       ('Mary', '300'),
       ('Peter', '400'),
       ('Sara', '500');


