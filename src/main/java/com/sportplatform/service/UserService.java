package com.sportplatform.service;

import com.sportplatform.dto.user.CreateUserDTO;
import com.sportplatform.dto.user.UpdateUserDTO;
import com.sportplatform.entity.User;
import com.sportplatform.repository.UserRepository;
import com.sportplatform.service.interfaces.UserServiceInterface;
import com.sportplatform.util.ExceptionUtils;
import com.sportplatform.util.MapperUtils;
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

    public ResponseEntity<User> createUser(CreateUserDTO createUserDTO) {
        User user = new User();
        User userMapper = MapperUtils.convert(user,createUserDTO);
        User createUser = userRepository.save(userMapper);
        return ResponseEntity.ok(createUser);
    }

    public ResponseEntity<User> updateUser(UpdateUserDTO updateUserDTO){
        User user = userRepository.findById(updateUserDTO.getId()).orElseThrow(ExceptionUtils::NotFound);
        User userMapper = MapperUtils.convert(user,updateUserDTO);
        User updateUser = userRepository.save(userMapper);
        return ResponseEntity.ok(updateUser);
    }
}
