package com.asi.api_generica_spring_boot.services.userservice;

import com.asi.api_generica_spring_boot.domain.entities.user.UserEntity;
import com.asi.api_generica_spring_boot.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private  final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public UserEntity createUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    public UserEntity buscarUser(Long id) {
        UserEntity user = userRepository.findById(id).orElseThrow(()-> new RuntimeException("User not found"));
        return user;
    }

    public UserEntity updateUser(Long id, UserEntity user) {
        UserEntity userData=buscarUser(id);

        userData.setFullName(user.getFullName());

        return userRepository.save(userData);
    }
}
