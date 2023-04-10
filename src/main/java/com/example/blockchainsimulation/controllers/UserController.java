package com.example.blockchainsimulation.controllers;

import com.example.blockchainsimulation.domain.data.User;
import com.example.blockchainsimulation.domain.dto.UserDto;
import com.example.blockchainsimulation.domain.mapper.UserMapper;
import com.example.blockchainsimulation.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Optional;

@RequestMapping("/app/blockchain/user/")
@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping()
    public ResponseEntity<UserDto> addUser(@RequestBody UserDto userDto) {
        Optional<User> savedUser = userService.addUser(userDto);
        if(savedUser.isPresent()) {
            return ResponseEntity.ok().body(userDto);
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/showUserByName/{login}")
    public ResponseEntity<UserDto> showUserByName(@PathVariable String login) {
        Optional<User> user = userService.findUserByLogin(login);
        UserDto userDto = UserMapper.mapOptionalUserToUserDto(user);
        if(user.isPresent()){
            return ResponseEntity.ok().body(userDto);
        }
        else{
            return ResponseEntity.notFound().build();
        }
    }
}
