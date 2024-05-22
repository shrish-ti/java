package com.practice.spring;

import com.practice.spring.Constants.VehicleType;
import com.practice.spring.OOPS.InheritancePolymorphismEncapsulation.ChildClasses.CarMultilevelInheritance;
import com.practice.spring.OOPS.InheritancePolymorphismEncapsulation.ChildClasses.CarSingleInheritanceAndRuntimePolymorphism;
import com.practice.spring.OOPS.InheritancePolymorphismEncapsulation.ChildClasses.CompileTimePolymorphism;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		CarMultilevelInheritance car = new CarMultilevelInheritance("Mercedes", 4, VehicleType.CAR);
		CarSingleInheritanceAndRuntimePolymorphism singleInheritance = new CarSingleInheritanceAndRuntimePolymorphism("Mercedes", 4, VehicleType.CAR);
		// singleInheritance.wheels; this cannot be accessed from here as it has protected access.
		CompileTimePolymorphism cp = new CompileTimePolymorphism();
		cp.function();
		cp.function("Hello");
		car.printVehicleInfo();
	}

}
