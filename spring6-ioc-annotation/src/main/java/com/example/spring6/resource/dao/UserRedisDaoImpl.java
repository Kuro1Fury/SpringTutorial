package com.example.spring6.resource.dao;

import org.springframework.stereotype.Repository;

@Repository("myUserRedisDao")
public class UserRedisDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("Redis dao add...");
    }
}
