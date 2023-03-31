package com.example.blockchainsimulation.domain;

import java.util.Date;

public class BlockInfoDto {

    private Date timeOfCreation;

    private Integer blockChainVersion;

    public Date getTimeOfCreation() {
        return timeOfCreation;
    }

    public void setTimeOfCreation(Date timeOfCreation) {
        this.timeOfCreation = timeOfCreation;
    }

    public Integer getBlockChainVersion() {
        return blockChainVersion;
    }

    public void setBlockChainVersion(Integer blockChainVersion) {
        this.blockChainVersion = blockChainVersion;
    }
}
