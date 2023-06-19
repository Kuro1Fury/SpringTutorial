package org.example.spring6.iocxml.life;

public class User {

    private String name;

    // Zero constructor
    public User() {
        System.out.println("1. Bean Construction: Zero constructor is called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("2. Set properties: setName() is called");
    }

    // Init method
    public void initMethod() {
        System.out.println("4. Init method: initMethod() is called");
    }

    // Destroy method
    public void destroyMethod() {
        System.out.println("7. Destroy method: destroyMethod() is called");
    }
}
