package com.practice.spring.OOPS.Associations;

import com.practice.spring.Constants.DepartmentType;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class Student {

    private final String name;
    private final int rollNumber;
    private final DepartmentType department;
    private final String hostel;

    // Here there is constructor of Student class. Hence, its object can be made by itself. It can be made by self or by
    // College class's object and when college class's object is destroyed, this is not destroyed.
    // This tells that Student object can exist without college. Hence, the type of relationship between Student
    // and College is Aggregation (Weak association)

    public void printStudentInfo() {
        log.info("Name: {}, Roll Number: {}, Department: {}, Hostel: {}", name, rollNumber, department.name(), hostel);
    }

}
