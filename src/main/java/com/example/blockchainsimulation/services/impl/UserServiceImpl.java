package com.example.blockchainsimulation.services.impl;

import com.example.blockchainsimulation.domain.user.UserDto;
import com.example.blockchainsimulation.services.UserService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Override
    public UserDto addUser(UserDto userDto) {
        return null;
    }

    @Override
    public UserDto getUserByName(String name) {
        return null;
    }
}
