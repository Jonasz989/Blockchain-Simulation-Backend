package com.example.blockchainsimulation.domain.mapper;

import com.example.blockchainsimulation.domain.data.User;
import com.example.blockchainsimulation.domain.dto.UserDto;

import java.util.Optional;

public class UserMapper {
    public static User mapUserDtoToUser(UserDto userDto) {
        User user = new User();
        user.setUserUUID(userDto.getUserUUID());
        user.setLogin(userDto.getLogin());
        user.setPassword(userDto.getPassword());
        user.setWalletUUID(userDto.getWalletUUID());
        return user;
    }

    public static UserDto mapUserToUserDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setUserUUID(user.getUserUUID());
        userDto.setLogin(user.getLogin());
        userDto.setPassword(user.getPassword());
        userDto.setWalletUUID(user.getWalletUUID());
        return userDto;
    }
    public static User mapOptionalUserDtoToUser(Optional<UserDto> userDto) {
        return mapUserDtoToUser(userDto.get());
    }

    public static UserDto mapOptionalUserToUserDto(Optional<User> user) {
        return mapUserToUserDto(user.get());
    }
}
