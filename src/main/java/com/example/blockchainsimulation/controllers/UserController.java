package com.example.blockchainsimulation.controllers;

import com.example.blockchainsimulation.domain.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/rest/user/")
public class UserController {

    @PostMapping()
    public ResponseEntity<UserDto> addUser(@RequestBody UserDto userDto) {
        return ResponseEntity.ok().body(new UserDto());
    }

    @GetMapping("/showUserByName/{name}")
    public ResponseEntity<UserDto> showUserByName(@PathVariable String name) {

        return ResponseEntity.ok().body(new UserDto());
    }
}
