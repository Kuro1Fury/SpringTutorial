package com.example.spring6.autowire.service;

import com.example.spring6.autowire.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    // Inject dao
    // Method 1: property injection
//    @Autowired // Find corresponding object by type and finish injection
//    private UserDao userDao;


    // Method 2: Setter injection
//    private UserDao userDao;
//
//    @Autowired
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    // Method 3: Contructor injection
//    private UserDao userDao;
//
//    @Autowired
//    public UserServiceImpl(UserDao userDao) {
//        this.userDao = userDao;
//    }

    // Method 4: Argument injection
//    private UserDao userDao;
//
//    public UserServiceImpl(@Autowired UserDao userDao) {
//        this.userDao = userDao;
//    }

    // Method 5: Only one constructor, no need to use @Autowired
//    private UserDao userDao;
//
//    public UserServiceImpl(UserDao userDao) {
//        this.userDao = userDao;
//    }

    // Method 6: use @Autowired and @Qualifier to inject by name
    @Autowired
    @Qualifier(value = "userRedisDaoImpl")
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("Service add...");
        userDao.add();
    }
}
