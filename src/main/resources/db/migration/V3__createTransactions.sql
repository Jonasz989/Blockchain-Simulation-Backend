CREATE TABLE transactions
(
    transaction_id varchar(128)   NOT NULL,
    value          decimal(10, 2) NOT NULL,
    time           timestamp      NOT NULL,
        PRIMARY KEY (transaction_id)
);


INSERT INTO transactions (transaction_id, value, time)
values (1, 10.0, '2019-01-01 00:00:00'),
       (2, 20.0, '2019-01-02 00:00:00'),
       (3, 30.0, '2019-01-03 00:00:00'),
       (4, 40.0, '2019-01-04 00:00:00'),
       (5, 50.0, '2019-01-05 00:00:00'),
       (6, 60.0, '2019-01-06 00:00:00'),
       (7, 70.0, '2019-01-07 00:00:00'),
       (8, 80.0, '2019-01-08 00:00:00'),
       (9, 90.0, '2019-01-09 00:00:00'),
       (10, 100.0, '2019-01-10 00:00:00');