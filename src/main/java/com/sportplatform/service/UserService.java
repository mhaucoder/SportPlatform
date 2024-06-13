package com.sportplatform.service;

import com.sportplatform.entity.User;
import com.sportplatform.repository.UserRepository;
import com.sportplatform.service.interfaces.UserServiceInterface;
import com.sportplatform.util.ExceptionUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements UserServiceInterface {
    final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity<User> getUserById(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            return ResponseEntity.ok(user.get());
        }else{
            throw ExceptionUtils.NotFound();

        }
    }
}
