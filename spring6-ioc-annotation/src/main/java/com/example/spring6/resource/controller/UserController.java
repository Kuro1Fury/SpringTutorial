package com.example.spring6.resource.controller;

import com.example.spring6.resource.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;

@Controller("myUserController")
public class UserController {

    // Inject by name
//    @Resource(name = "myUserService")
//    private UserService userService;

    // Inject by type
    @Resource
    private UserService userService;

    public void add() {
        System.out.println("Controller add...");
        userService.add();
    }
}
