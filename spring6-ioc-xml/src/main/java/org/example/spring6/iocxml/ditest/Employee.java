package org.example.spring6.iocxml.ditest;

public class Employee {

    // Employee belongs to a particular department

    // Object type
    private Department dept;
    private String ename;
    private Integer age;

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
    }
}
