package com.practice.spring.OOPS.ChildClasses;

import com.practice.spring.Constants.VehicleType;
import com.practice.spring.OOPS.BaseClasses.Vehicles;
import lombok.extern.slf4j.Slf4j;

// Example of Encapsulation, Single Inheritance, IS-A RELATIONSHIP BETWEEN PARENT AND CHILD
@Slf4j
public class CarSingleInheritanceAndRuntimePolymorphism extends Vehicles {
    private String brand;
    public CarSingleInheritanceAndRuntimePolymorphism(String brand, int wheels, VehicleType type) {
        super(wheels, type);
        this.brand = brand;
    }
    @Override
    public void printVehicleInfo(){ // This is runtime polymorphism using function overriding
        log.info("Vehicle Type is {}", brand);
        int unused = super.wheels; // Wheels has protected access hence, it can be used in child class.
        // It is because of super that base class's function is being called, as it actually overrides the function.
        super.printVehicleInfo();
    }
}
