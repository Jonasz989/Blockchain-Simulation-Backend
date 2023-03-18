package com.example.blockchainsimulation.services;

import com.example.blockchainsimulation.domain.UserDto;
import org.apache.catalina.User;

public interface UserService {

    UserDto addUser(UserDto userDto);

    UserDto getUserByName(String name);
}
