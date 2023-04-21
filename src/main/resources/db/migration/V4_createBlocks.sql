CREATE TABLE blocks
(
    id                  SERIAL PRIMARY KEY,
    time_of_creation    TIMESTAMP   NOT NULL,
    block_chain_version INTEGER     NOT NULL,
    block_hash          VARCHAR(64) NOT NULL
);