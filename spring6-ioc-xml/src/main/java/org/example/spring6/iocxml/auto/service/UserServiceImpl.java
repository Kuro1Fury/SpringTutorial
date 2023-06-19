package org.example.spring6.iocxml.auto.service;

import org.example.spring6.iocxml.auto.dao.UserDao;
import org.example.spring6.iocxml.auto.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void addUserService() {
        System.out.println("addUserService() is called");
        userDao.addUserDao();

        // Vanilla call
//        UserDao userDao = new UserDaoImpl();
//        userDao.addUserDao();
    }
}
