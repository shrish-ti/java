package com.practice.spring.OOPS.ChildClasses;

import com.practice.spring.Constants.VehicleType;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CarMultilevelInheritance extends CarSingleInheritanceAndRuntimePolymorphism {
    private static final int unique = 877;

    public CarMultilevelInheritance(String brand, int wheels, VehicleType type) {
        super(brand, wheels, type);
    }

    @Override
    public void printVehicleInfo() {
        log.info(String.valueOf(unique));
        // super.brand; Cannot be called here as it has private access specifier.
        int unused = super.wheels; // Can be used as it is child from multiple inheritance.
        super.printVehicleInfo();
    }
}
