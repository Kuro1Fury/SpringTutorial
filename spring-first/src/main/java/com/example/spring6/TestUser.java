package com.example.spring6;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

public class TestUser {

    // Create Logger object
    private Logger logger = LoggerFactory.getLogger(TestUser.class);

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

        // Manually write the log
        logger.info("### Success called and executed");
    }

    // Reflection construction
    @Test
    public void testUserObject1() throws Exception {
        // Get class object
        Class<?> clazz = Class.forName("com.example.spring6.user");
        // Call constructor
        User user = (User) clazz.getDeclaredConstructor().newInstance();
        System.out.println(user);
    }
}
