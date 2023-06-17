package org.example.spring6.iocxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        // Get bean
        // (i) by id
        User user1 = (User) context.getBean("user");
        System.out.println("by id: " + user1);

        // (ii) by class
        User user2 = context.getBean(User.class);
        System.out.println("by class: " + user2);

        // (iii) by id and class
        User user3 = context.getBean("user", User.class);
        System.out.println("by id and class: " + user3);
    }
}
