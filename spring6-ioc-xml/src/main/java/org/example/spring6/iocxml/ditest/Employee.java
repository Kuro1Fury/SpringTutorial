package org.example.spring6.iocxml.ditest;

import java.util.Arrays;

public class Employee {

    // Employee belongs to a particular department

    // Object type
    private Department dept;
    private String ename;
    private Integer age;
    private String[] hobbies;

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void work() {
        System.out.println("employee work: " + ename + ", " + age);
        dept.info();
        System.out.println(Arrays.toString(hobbies));
    }
}
