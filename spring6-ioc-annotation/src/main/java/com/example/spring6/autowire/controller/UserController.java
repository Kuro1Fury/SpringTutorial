package com.example.spring6.autowire.controller;

import com.example.spring6.autowire.dao.UserDao;
import com.example.spring6.autowire.service.UserService;
import com.example.spring6.autowire.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    // Inject Service
    // Method 1: property injection
//    @Autowired // Find corresponding object by type and finish injection
//    private UserService userService;



    // Method 2: Setter injection
//    private UserService userService;
//
//    @Autowired
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }

    // Method 3: Contructor injection
//    private UserService userService;
//
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }

    // Method 4: Argument injection
//    private UserService userService;
//
//    public UserController(@Autowired UserService userService) {
//        this.userService = userService;
//    }

    // Method 5: Only one constructor, no need to use @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    public void add() {
        System.out.println("Controller add...");
        userService.add();
    }
}
