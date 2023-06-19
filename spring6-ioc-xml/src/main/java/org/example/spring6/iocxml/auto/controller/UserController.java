package org.example.spring6.iocxml.auto.controller;

import org.example.spring6.iocxml.auto.service.UserService;
import org.example.spring6.iocxml.auto.service.UserServiceImpl;

public class UserController {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser() {
        // Controller -> Service -> Dao
        System.out.println("controller: addUser() is called");

        // Call service method
        userService.addUserService();

        // Vanilla call
//        UserService userService = new UserServiceImpl();
//        userService.addUserService();
    }
}
