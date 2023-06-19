package com.example.spring6.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //Configuration class
@ComponentScan("com.example.spring6") //Scan all components in package "com.example.spring6
public class SpringConfig {
}
