package com.practice.spring.OOPS.Associations;

import com.practice.spring.Constants.DepartmentType;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
//@AllArgsConstructor - remove this, this will always create has a relationship
public class College {
    private String collegeName;
    private List<Department> departments; // This is Part-of (Composition) association between class College and Department
    private List<Student> students; // This is Has-A (Aggregation) association between class College and Department
    // IS-A relationship between classes - implemented using extends or implements keyword.
    // Even though both looks identical - from where does difference arise? How do we ensure first 1 is Composition and
    // Next one is aggregation? Using constructors given below:

    College(String collegeName, List<Student> students) { // List<Department> departments is not used here!
        this.collegeName = collegeName; // Has-a relationship with college name
        this.departments = new ArrayList<Department>(); // Part-of relationship
        this.students = students; // Has-a relationship
    }
    public void printCollegeInfo() {
      log.info("College name: {}", collegeName);
      for(Department department : departments) {
          log.info("Department is {}", department);
      }
      for(Student student: students) {
          log.info("Student is {}", student);
      }
    }

}
