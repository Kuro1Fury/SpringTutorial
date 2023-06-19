package com.example.spring6.resource;

import com.example.spring6.config.SpringConfig;
import com.example.spring6.resource.controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Full Annotation Development Test
public class TestUserControllerAnno {

    public static void main(String[] args) {
        // Load Configuration class
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController userController = context.getBean("myUserController", UserController.class);
        userController.add();
    }
}
