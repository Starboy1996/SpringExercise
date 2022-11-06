package com.example.JPADesign.Repos;

import com.example.JPADesign.Models.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository <Employee, Long> {

    List<Employee> findByLastName(String lastName);
    Employee findById(long id);
    Employee findByFirstName(String firstName);

}
