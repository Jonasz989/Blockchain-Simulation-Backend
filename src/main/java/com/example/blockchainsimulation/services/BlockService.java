package com.example.blockchainsimulation.services;

import com.example.blockchainsimulation.domain.BlockDto;

import java.util.UUID;

public interface BlockService {

    BlockDto getBlockByHash(String hashId);

    BlockDto getBlockByUUID(UUID uuid);
}