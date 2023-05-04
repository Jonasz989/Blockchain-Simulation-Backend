package com.example.blockchainsimulation.block.controller;

import com.example.blockchainsimulation.block.data.Block;
import com.example.blockchainsimulation.block.data.BlockDto;
import com.example.blockchainsimulation.block.service.BlockService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


//zmienic get na find

@RestController
@RequestMapping("/app/blockchain")
public class BlockController {

    private final BlockService blockService;


    public BlockController(BlockService blockService) {
        this.blockService = blockService;
    }

    @GetMapping("/findByHash/{id}")
    public ResponseEntity<BlockDto> getByHash(@PathVariable String hashId) {

        Optional<BlockDto> blockDto = blockService.getBlockByHash(hashId);
        if (blockDto.isPresent()) {
            return ResponseEntity.ok(blockDto.get());
        }else{
            return ResponseEntity.notFound().build();
        }

    }

//    @GetMapping("/findByUUID/{uuid}")
//    public ResponseEntity<BlockDto> getByUUID(@PathVariable UUID uuid) {
//        if (uuid == null) {
//            return ResponseEntity.badRequest().build();
//        }
//
//        return ResponseEntity.ok().body(new BlockDto());
//    }

    @GetMapping("/{lastBlockNumber}")
    public ResponseEntity<Block> getLastBlockInfo(@PathVariable String lastBlockNumber) {
        Optional<Block> block = blockService.getLastBlockInfo();
        if (block.isPresent()) {
            return ResponseEntity.ok(block.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }
}
