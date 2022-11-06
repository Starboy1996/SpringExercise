package com.example.JPADesign.Controllers;

import com.example.JPADesign.Models.Project;
import com.example.JPADesign.Repos.ProjectRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ProjectController {

    @Resource
    ProjectRepository projectRepo;

    @GetMapping
    public Iterable<Project> getAllProjects() {return projectRepo.findAll();}
}
