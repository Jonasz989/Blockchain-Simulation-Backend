package com.example.blockchainsimulation.services;

import com.example.blockchainsimulation.domain.data.Block;
import com.example.blockchainsimulation.domain.dto.BlockDto;

import java.util.Optional;
import java.util.UUID;

public interface BlockService {

    Optional<BlockDto> getBlockByHash(String hashId);
    Optional<Block> getLastBlockInfo();

//    Optional<BlockDto> getBlockByUUID(UUID uuid);
}
