package com.example.blockchainsimulation.controllers;

import com.example.blockchainsimulation.domain.BlockDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/rest")
public class BlockController {

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
