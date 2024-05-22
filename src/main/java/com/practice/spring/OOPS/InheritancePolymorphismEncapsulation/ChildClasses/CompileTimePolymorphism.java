package com.practice.spring.OOPS.InheritancePolymorphismEncapsulation.ChildClasses;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CompileTimePolymorphism {

    // There are two methods for compile time polymorphism - function overloading and operator overloading - Java does
    // not support operator overloading.
    public void function() { // Compile time polymorphism
        System.out.println("Function with name function() is called");
    }

    public void function(String var) { // Function overloading
        System.out.println("Function with input is called");
    }

}
