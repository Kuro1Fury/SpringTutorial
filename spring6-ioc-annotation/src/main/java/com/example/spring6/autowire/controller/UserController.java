package com.example.spring6.autowire.controller;

import com.example.spring6.autowire.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    // Inject Service
    @Autowired // Find corresponding object by type and finish injection
    private UserService userService;

    public void add() {
        System.out.println("Controller add...");
        userService.add();
    }
}
