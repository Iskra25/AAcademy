package com.aacademy.aacademy.service;


import com.aacademy.aacademy.entyty.User;
import com.aacademy.aacademy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

@Autowired
    public UserService(UserRepository userRepository){

        this.userRepository = userRepository;
    }

    public User save(User user){

     return userRepository.save(user);

 }
}







