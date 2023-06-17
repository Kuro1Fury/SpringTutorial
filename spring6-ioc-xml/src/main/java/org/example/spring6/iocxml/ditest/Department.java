package org.example.spring6.iocxml.ditest;

import java.util.List;

public class Department {

    private List<Employee> empList;

    private String dname;

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public List<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }

    public void info() {
        System.out.println("Department info: " + dname);
        for (Employee e : empList) {
            System.out.println(e.getEname());
        }
    }
}
