package com.example.blockchainsimulation.domain.mapper;

import com.example.blockchainsimulation.domain.data.Block;
import com.example.blockchainsimulation.domain.dto.BlockDto;

import java.util.Optional;

public class BlockMapper {
    public static Block mapBlockDtoToBlock(BlockDto blockDto) {

        Block block = new Block();

        block.setBlockHash(blockDto.getBlockHash());
        block.setTimeOfCreation(blockDto.getTimeOfCreation());
        block.setBlockChainVersion(blockDto.getBlockchainVersion());
        block.setTransactions(blockDto.getTransactionList());

        return block;
    }

    public static BlockDto mapBlockToBlockDto(Block block) {

        BlockDto blockDto = new BlockDto();

        blockDto.setBlockHash(block.getBlockHash());
        blockDto.setTimeOfCreation(block.getTimeOfCreation());
        blockDto.setBlockchainVersion(block.getBlockChainVersion());
        blockDto.setTransactionList(block.getTransactions());

        return blockDto;
    }

    public static BlockDto mapOptionalBlockToBlockDto(Optional<Block> block){
        BlockDto blockDto = mapBlockToBlockDto(block.get());
        return blockDto;
    }

    public static Block mapOptionalBlockDtoToBlock(Optional<BlockDto> blockDto){
        Block block = mapBlockDtoToBlock(blockDto.get());
        return block;
    }
}
