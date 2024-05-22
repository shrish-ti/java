package com.practice.spring.OOPS.Associations;

import com.practice.spring.Constants.DepartmentType;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@AllArgsConstructor
public class College {
    private String collegeName;
    private List<Department> departments; // This is Part-of (Composition) association between class College and Department
    private List<Student> students; // This is Has-A (Aggregation) association between class College and Department
    // IS-A relationship between classes - implemented using extends or implements keyword.
    // Even though both looks identical - from where does difference arise? How do we ensure first 1 is Composition and
    // Next one is aggregation? Using constructors! Look at the classes of Department and Student
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
