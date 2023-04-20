package com.example.blockchainsimulation.block.data;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BlockHeader {

    private LocalDateTime localDateTime;

    private static int version;

    private String merkleRoot;

    private int difficultyTarget;

    private int nonce;

    private String previousBlockHeaderHash;
}
