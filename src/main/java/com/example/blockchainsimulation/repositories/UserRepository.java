package com.example.blockchainsimulation.repositories;

import com.example.blockchainsimulation.domain.data.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
