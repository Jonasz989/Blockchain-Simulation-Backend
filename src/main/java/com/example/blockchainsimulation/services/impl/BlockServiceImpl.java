package com.example.blockchainsimulation.services.impl;

import com.example.blockchainsimulation.domain.dto.BlockDto;
import com.example.blockchainsimulation.repositories.BlockRepository;
import com.example.blockchainsimulation.services.BlockService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BlockServiceImpl implements BlockService {
    private final BlockRepository blockRepository;

    public BlockServiceImpl(BlockRepository blockRepository) {
        this.blockRepository = blockRepository;
    }

    @Override
    public BlockDto getBlockByHash(String hashId) {

        return null;
    }

    @Override
    public BlockDto getBlockByUUID(UUID uuid) {
        return null;
    }
}
