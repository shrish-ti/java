package com.practice.spring.OOPS.InheritancePolymorphismEncapsulation.BaseClasses;

import com.practice.spring.Constants.VehicleType;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

// Example of Encapsulation
@Slf4j
@AllArgsConstructor
public class Vehicles {
    protected int wheels;
    public VehicleType type;

    public void printVehicleInfo() {
        log.info("Number of wheels {}", wheels);
        log.info("Type of Vehicle {}", type.toString());
    }
}
