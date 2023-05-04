package com.example.blockchainsimulation.block.repository;

import com.example.blockchainsimulation.block.data.Block;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockRepository extends CrudRepository<Block, Long> {
}
