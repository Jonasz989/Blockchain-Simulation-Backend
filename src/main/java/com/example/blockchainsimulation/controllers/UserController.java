package com.example.blockchainsimulation.controllers;

import com.example.blockchainsimulation.domain.UserDto;
import com.example.blockchainsimulation.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/rest/user/")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping()
    public ResponseEntity<UserDto> addUser(@RequestBody UserDto userDto) {
        return ResponseEntity.ok().body(new UserDto());
    }

    @GetMapping("/showUserByName/{name}")
    public ResponseEntity<UserDto> showUserByName(@PathVariable String name) {

        return ResponseEntity.ok().body(new UserDto());
    }
}
