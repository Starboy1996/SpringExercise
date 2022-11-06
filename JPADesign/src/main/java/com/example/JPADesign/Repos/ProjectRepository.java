package com.example.JPADesign.Repos;


import com.example.JPADesign.Models.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository <Project, Long>{
    interface EmployeeProjectRepository {
    }
}
