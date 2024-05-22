package com.practice.spring.OOPS.Associations;

import com.practice.spring.Constants.DepartmentType;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class Department {
    private DepartmentType departmentType;

    void printDepartment() {
        log.info("Department: {}", departmentType);
    }
}
