package com.example.spring6;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    @Test
    public void testUserObject() {
        // Load spring configuration file, create spring container
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // Get object from spring container
        User user = (User) context.getBean("user");
        System.out.println("1:" + user);

        // Call methods on the bean and test the results
        System.out.print("2:");
        user.add();
    }
}
