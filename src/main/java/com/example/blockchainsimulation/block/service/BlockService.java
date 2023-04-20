package com.example.blockchainsimulation.block.service;

import com.example.blockchainsimulation.block.data.Block;
import com.example.blockchainsimulation.block.data.BlockDto;

import java.util.Optional;

public interface BlockService {

    Optional<BlockDto> getBlockByHash(String hashId);
    Optional<Block> getLastBlockInfo();

//    Optional<BlockDto> getBlockByUUID(UUID uuid);
}
