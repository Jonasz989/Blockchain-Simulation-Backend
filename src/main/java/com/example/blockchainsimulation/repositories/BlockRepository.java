package com.example.blockchainsimulation.repositories;

import com.example.blockchainsimulation.domain.data.Block;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockRepository extends CrudRepository<Block, Long> {
}
