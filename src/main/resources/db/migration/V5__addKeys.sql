-- CREATE SEQUENCE transactions_seq START 1;
--
-- ALTER TABLE clients
-- ADD CONSTRAINT clients_wallet_fkey
-- FOREIGN KEY (wallet_id) REFERENCES wallets (id) ON DELETE CASCADE;
--
-- ALTER TABLE wallets
-- ADD CONSTRAINT wallets_clients_fkey
-- FOREIGN KEY (client_id) REFERENCES clients (id);
--
-- ALTER TABLE transactions
-- ADD CONSTRAINT transactions_wallets_fkey
-- FOREIGN KEY (wallet_id) REFERENCES wallets (id);
--
-- ALTER TABLE transactions
-- ADD CONSTRAINT transactions_blocks_fkey
-- FOREIGN KEY (block_id) REFERENCES blocks (id);