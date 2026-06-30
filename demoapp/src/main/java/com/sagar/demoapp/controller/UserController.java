package com.sagar.demoapp.controller;

import com.sagar.demoapp.entity.User;
import com.sagar.demoapp.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Get all users
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // Add a new user
    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
}