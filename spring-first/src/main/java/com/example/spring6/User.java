package com.example.spring6;

public class User {

    // Zero Constructor
    public User() {
        System.out.println("0: Zero Constructor Executed");
    }

    public void add() {
        System.out.println("add...");
    }

    public static void main(String[] args) {
        User user = new User();
        user.add();
    }
}
