package com.example.JPADesign.Models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String projectName;

    protected Project(){
    }

    public Project(Long id, String projectName){
        this.id = id;
        this.projectName = projectName;
    }

    @Override
    public String toString() {
        return String.format("Project[id=%d, projectName='%s']", id, projectName);
    }
}
