package com.example.blockchainsimulation.services;

import com.example.blockchainsimulation.domain.data.User;
import com.example.blockchainsimulation.domain.dto.UserDto;

import java.util.Optional;

public interface UserService {

    Optional<User> addUser(UserDto userDto);

    Optional<User> findUserByLogin(String login);
}
