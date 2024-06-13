package com.sportplatform.controller;

import com.sportplatform.repository.UserRepository;
import com.sportplatform.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    protected final UserService userService;

    public UserController(UserRepository userRepository, UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public ResponseEntity<?> getUser(){
        return userService.getUserById(4L);
    }
}
