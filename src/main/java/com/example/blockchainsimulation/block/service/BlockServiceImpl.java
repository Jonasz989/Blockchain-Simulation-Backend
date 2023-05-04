package com.example.blockchainsimulation.block.service;

import com.example.blockchainsimulation.block.data.Block;
import com.example.blockchainsimulation.block.data.BlockDto;
import com.example.blockchainsimulation.block.mapper.BlockMapper;
import com.example.blockchainsimulation.block.repository.BlockRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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

            Block lastBlock = null;
            Iterable<Block> blocks = iterableBlocks.get();
            for(Block block : blocks){
                lastBlock = block;
            }

            if(lastBlock == null) {
                return Optional.empty();
            }
            return Optional.of(lastBlock);
        }else{
            return Optional.empty();
        }
    }

    @Override
    public Optional<BlockDto> getBlockByHash(String hashId) {

        Optional<Iterable<Block>> iterableBlocks = Optional.of(blockRepository.findAll());
        if(iterableBlocks.isPresent()) {
            for(Block block : iterableBlocks.get()){
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
    public void createBlock(){
        Optional<Block> optionalBlock = getLastBlockInfo();
        if(optionalBlock.isEmpty()){
            Block block = new Block();
            block.setTransactions(List.of());
            block.setBlockHash("0000000000000000000000000000000000000000000000000000000000000000");
            block.setBlockChainVersion(0);
            block.setTimeOfCreation(LocalDateTime.now());

            blockRepository.save(block);
        }
    }
}
