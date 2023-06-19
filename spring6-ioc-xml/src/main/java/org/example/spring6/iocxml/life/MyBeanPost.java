package org.example.spring6.iocxml.life;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPost implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) {
        System.out.println("3. BeanPostProcessor: postProcessBeforeInitialization() is called");
        System.out.println("bean: " + bean + ", beanName: " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) {
        System.out.println("5. BeanPostProcessor: postProcessAfterInitialization() is called");
        System.out.println("bean: " + bean + ", beanName: " + beanName);
        return bean;
    }
}
