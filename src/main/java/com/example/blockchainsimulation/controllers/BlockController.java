package com.example.blockchainsimulation.controllers;

import com.example.blockchainsimulation.domain.dto.BlockDto;
import com.example.blockchainsimulation.services.BlockService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.util.UUID;

@RestController
@RequestMapping("/app/blockchain")
public class BlockController {

    private final BlockService blockService;


    public BlockController(BlockService blockService) {
        this.blockService = blockService;
    }

    @GetMapping("/findByHash/{id}")
    public ResponseEntity<BlockDto> getByHash(@PathVariable String hashId) {
        if (hashId.isBlank()) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok().body(new BlockDto());
    }

    @GetMapping("/findByUUID/{uuid}")
    public ResponseEntity<BlockDto> getByUUID(@PathVariable UUID uuid) {
        if (uuid == null) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok().body(new BlockDto());
    }
}
