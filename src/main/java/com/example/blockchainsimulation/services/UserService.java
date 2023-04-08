package com.example.blockchainsimulation.services;

import com.example.blockchainsimulation.domain.user.UserDto;

public interface UserService {

    UserDto addUser(UserDto userDto);

    UserDto getUserByName(String name);
}
