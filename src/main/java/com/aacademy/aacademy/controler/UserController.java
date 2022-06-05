package com.aacademy.aacademy.controler;


import com.aacademy.aacademy.entyty.User;
import com.aacademy.aacademy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;

    }


    @PostMapping(value = "/user/save")
    public String save(@RequestBody User user) {
        userService.save(user);
        return "User successfully saved";

    }

    //localhost:8080/user/find/1
    //localhost:8080/user/find/100
    @GetMapping(value = "/user/find/{id}")
    public User findByID(@PathVariable Long id){
        return userService.findById(id);

    }
}


