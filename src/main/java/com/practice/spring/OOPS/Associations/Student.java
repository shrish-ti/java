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

    public void printStudentInfo() {
        log.info("Name: {}, Roll Number: {}, Department: {}, Hostel: {}", name, rollNumber, department.name(), hostel);
    }

}
