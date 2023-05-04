package com.example.blockchainsimulation.wallet.service;

import com.example.blockchainsimulation.client.data.ClientDto;
import com.example.blockchainsimulation.transaction.data.Transaction;
import com.example.blockchainsimulation.wallet.data.Wallet;
import com.example.blockchainsimulation.wallet.data.WalletDto;
import com.example.blockchainsimulation.wallet.mapper.WalletMapper;
import com.example.blockchainsimulation.wallet.repository.WalletRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.UUID;

@Service
public class WalletImpl implements WalletService {

    private final WalletRepository walletRepository;

    public WalletImpl(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    @Override
    public Optional<Wallet> findWalletByUUID(String uuid) {
        Iterable<Wallet> wallets = walletRepository.findAll();
        for(Wallet wallet :wallets){
            if(wallet.getWalletUUID().equals(uuid)){
                return Optional.of(wallet);
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<Iterable<Wallet>> findAll() {
        Optional<Iterable<Wallet>> walletList = Optional.of(walletRepository.findAll());
        if (walletList.isPresent()){
            return walletList;
        }else {
            return Optional.empty();
        }
    }

    @Override
    public BigDecimal getTotalBalance() {
        Optional<Iterable<Wallet>> optionalWallets = Optional.of(walletRepository.findAll());
        BigDecimal total = new BigDecimal(0);
        if (optionalWallets.isPresent()){
            Iterable<Wallet> wallets = optionalWallets.get();
            for(Wallet w : wallets) {
                BigDecimal currentValue = new BigDecimal(0);
                for(Transaction tx : w.getTransactionList()) {
                    currentValue = currentValue.add(tx.getValue());
                }
                total = total.add(currentValue);
            }
        }
        return total;
    }

    public Optional<WalletDto> save(WalletDto dto){
        Optional<WalletDto> walletDto = Optional
                .of(
                        WalletMapper.mapWalletToWalletDto(walletRepository.save(WalletMapper.mapWalletDtoToWallet(dto))
                        ));
        return walletDto;
    }

    @Override
    public Wallet createWallet(ClientDto clientDto) {
        Wallet wallet = new Wallet();
        wallet.setWalletUUID(UUID.randomUUID().toString());
        wallet.setTransactionList(clientDto.getWalletDto().getTransactions());
        wallet.setClientUUID(clientDto.getClientUUID());
        return wallet;
    }
}
