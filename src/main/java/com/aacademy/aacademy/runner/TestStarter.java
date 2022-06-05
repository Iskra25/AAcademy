package com.aacademy.aacademy.runner;

import com.aacademy.aacademy.entyty.User;
import com.aacademy.aacademy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestStarter implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setFirstName("Georgi");
        user.setLastName("Georgiev");
        user.setAge(30);

        userRepository.save(user);

    }
}
