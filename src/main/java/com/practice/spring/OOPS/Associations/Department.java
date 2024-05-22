package com.practice.spring.OOPS.Associations;

import com.practice.spring.Constants.DepartmentType;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Department {
    private DepartmentType departmentType;

    // Here there is no constructor of Department class. Hence, its object cannot be made by itself. It will be only
    // made when College class's object is created and when college class's object is destroyed, this is also destroyed.
    // This tells that department object cannot exist without college. Hence, the type of relationship between department
    // and College is Composition (Strong association)

    void printDepartment() {
        log.info("Department: {}", departmentType);
    }
}
