package com.example.spring6.validator.one;

import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

public class TestPerson {

    public static void main(String[] args) {
        // Create Person object
        Person p = new Person();
        p.setName("John");
        p.setAge(-1);

        // Create corresponding databinder
        DataBinder binder = new DataBinder(p);

        // Set validator
        binder.setValidator(new PersonValidator());

        // Validate
        binder.validate();

        // Output errors
        BindingResult result = binder.getBindingResult();
        System.out.println(result.getAllErrors());

    }
}
