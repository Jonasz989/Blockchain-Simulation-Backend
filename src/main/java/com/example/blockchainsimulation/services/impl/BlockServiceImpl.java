package com.example.blockchainsimulation.services.impl;

import com.example.blockchainsimulation.domain.data.Block;
import com.example.blockchainsimulation.domain.dto.BlockDto;
import com.example.blockchainsimulation.domain.mapper.BlockMapper;
import com.example.blockchainsimulation.repositories.BlockRepository;
import com.example.blockchainsimulation.services.BlockService;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class BlockServiceImpl implements BlockService {
    private final BlockRepository blockRepository;

    public BlockServiceImpl(BlockRepository blockRepository) {
        this.blockRepository = blockRepository;
    }

    @Override
    public Optional<Block> getLastBlockInfo() {
        Optional<Iterable<Block>> iterableBlocks = Optional.of(blockRepository.findAll());
        if(iterableBlocks.isPresent()) {
            Block block = null;
            while(iterableBlocks.get().iterator().hasNext()){
                block = iterableBlocks.get().iterator().next();
            }
            return Optional.of(block);
        }else{
            return Optional.empty();
        }
    }
    @Override
    public Optional<BlockDto> getBlockByHash(String hashId) {

        Optional<Iterable<Block>> iterableBlocks = Optional.of(blockRepository.findAll());

        if(iterableBlocks.isPresent()) {
            Block block = null;
            while(iterableBlocks.get().iterator().hasNext()){
                block = iterableBlocks.get().iterator().next();
                if(block.getBlockHash().equals(hashId)){
                    return Optional.of(BlockMapper.mapBlockToBlockDto(block));
                }
            }
            return Optional.empty();
        }else{
            return Optional.empty();
        }
    }

//sprawdzic dokumentacje w sprawiw wyszukiwania przez uuid

//    @Override
//    public Optional<BlockDto> getBlockByUUID(UUID uuid) {
//        Optional<Iterable<Block>> iterableBlocks = Optional.of(blockRepository.findAll());
//
//        if(iterableBlocks.isPresent()) {
//            Block block = null;
//            while(iterableBlocks.get().iterator().hasNext()){
//                block = iterableBlocks.get().iterator().next();
//                if(block.get().equals(hashId)){
//                    return Optional.of(BlockMapper.mapBlockToBlockDto(block));
//                }
//            }
//            return Optional.empty();
//        }else{
//            return Optional.empty();
//        }
//    }
}
