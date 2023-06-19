package com.example.spring6.resource.service;

import com.example.spring6.resource.dao.UserDao;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value = "myUserService")
public class UserServiceImpl implements UserService {

    // If name is not specified, inject by parameter name
    @Resource
    private UserDao myUserDao;

    @Override
    public void add() {
        System.out.println("Service add...");
        myUserDao.add();
    }
}
