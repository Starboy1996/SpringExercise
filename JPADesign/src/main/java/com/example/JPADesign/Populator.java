package com.example.JPADesign;

import com.example.JPADesign.Models.Address;
import com.example.JPADesign.Repos.ProjectRepository;
import com.example.JPADesign.Repos.AddressRepository;
import com.example.JPADesign.Repos.EmployeeRepository;
import com.example.JPADesign.Models.Employee;
import org.springframework.boot.CommandLineRunner;

import javax.annotation.Resource;

public class Populator implements CommandLineRunner {

    @Resource
    private EmployeeRepository employeeRepo;

    @Resource
    private AddressRepository addressRepo;

    @Resource
    private ProjectRepository projectRepo;

    @Resource
    private ProjectRepository.EmployeeProjectRepository employeeProjectRepository;


    @Override
    public void run(String... args) throws Exception {
        Employee employeeOne = new Employee("Matthew","Alex","Andersen","Mr.");
        Employee employeeTwo = new Employee("Tom","Adam","Holland","Mr.");
        Employee employeeThree = new Employee("Henry", "", "Allen", "Mr.");
        Address addressOne = new Address("123 Main Street","","","Columbus","TN","43017","","Hamilton","United States");

        employeeRepo.save(employeeOne);
        employeeRepo.save(employeeTwo);
        employeeRepo.save(employeeThree);
        addressRepo.save(addressOne);
    }
}
