package com.example.blockchainsimulation.services.impl;

import com.example.blockchainsimulation.domain.block.BlockDto;
import com.example.blockchainsimulation.services.BlockService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
@Transactional
public class BlockServiceImpl implements BlockService {

    @Override
    public BlockDto getBlockByHash(String hashId) {
        return null;
    }

    @Override
    public BlockDto getBlockByUUID(UUID uuid) {
        return null;
    }
}
