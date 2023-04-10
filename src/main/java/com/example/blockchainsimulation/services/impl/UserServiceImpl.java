package com.example.blockchainsimulation.services.impl;

import com.example.blockchainsimulation.domain.data.User;
import com.example.blockchainsimulation.domain.dto.UserDto;
import com.example.blockchainsimulation.domain.mapper.Mapper;
import com.example.blockchainsimulation.domain.mapper.UserMapper;
import com.example.blockchainsimulation.repositories.UserRepository;
import com.example.blockchainsimulation.services.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> addUser(UserDto userDto) {
        User user = UserMapper.mapUserDtoToUser(userDto);
        Optional<User> savedUser = Optional.of(userRepository.save(user));
        if(savedUser.isPresent()){
            return savedUser;
        } else {
            return Optional.empty();
        }
    }

    @Override
    public Optional<List<User>> findUserByLogin(String login) {
        Iterable<User> usersList = userRepository.findAll();
        List<User> finalList = new ArrayList<>();
        for(User user : usersList) {
            if(user.getLogin().equals(login)){
                finalList.add(user);
            }
        }
        if(finalList.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(finalList);
    }
}
