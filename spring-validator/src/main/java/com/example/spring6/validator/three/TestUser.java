package com.example.spring6.validator.three;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUser {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ValidationConfig.class);

        MyService myService = context.getBean(MyService.class);

        User user = new User();
        user.setName("Allan");
        user.setPhone("13123456789");
        user.setAge(100);
        user.setMessage("hello world");
        myService.testMethod(user);
    }
}
