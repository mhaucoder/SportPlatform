package com.sportplatform.controller;

import com.sportplatform.dto.user.CreateUserDTO;
import com.sportplatform.dto.user.UpdateUserDTO;
import com.sportplatform.service.UserService;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {
    protected final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public ResponseEntity<?> getUser(@NotNull Long id){
        return userService.getUserById(id);
    }
    @PostMapping()
    public ResponseEntity<?> createUser(@Validated CreateUserDTO createUserDTO){
        return userService.createUser(createUserDTO);
    }

    @PutMapping()
    public ResponseEntity<?> updateUser(@Validated UpdateUserDTO updateUserDTO){
        return userService.updateUser(updateUserDTO);
    }
}
