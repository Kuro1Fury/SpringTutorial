package org.example.spring6.iocxml.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserJi {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserJi userJi = context.getBean(UserJi.class); // Work only if there is only one bean of type UserJi
        System.out.println(userJi);
        userJi.run();
    }
}
