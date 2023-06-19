package com.example.spring6.autowire.service;

import com.example.spring6.autowire.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    // Inject dao
    // Method 1: property injection
    @Autowired // Find corresponding object by type and finish injection
    private UserDao userDao;


    @Override
    public void add() {
        System.out.println("Service add...");
        userDao.add();
    }
}
