package com.example.JPADesign.Controllers;

import com.example.JPADesign.Models.Employee;
import com.example.JPADesign.Repos.EmployeeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class EmployeeController {

    @Resource
    EmployeeRepository employeeRepo;

    @GetMapping("/Employees")
    public Iterable<Employee> getAllEmployees() { return employeeRepo.findAll();}



}
