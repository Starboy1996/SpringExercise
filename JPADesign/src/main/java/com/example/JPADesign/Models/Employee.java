package com.example.JPADesign.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;

    protected Employee() {

    }

    public Employee(String firstName, String middleName, String lastName, String suffix) {

        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.suffix = suffix;

    }

    @Override
    public String toString() {
        return String.format("Employee[id=%d, firstName='%s', middleName='%s, lastName='%s', suffix='%s]", id, firstName, middleName, lastName, suffix);
    }

    public Long getId() { return id; }

    public String getFirstName() { return firstName; }

    public String getMiddleName() { return middleName; }

    public String getLastName() { return lastName; }

    public String getSuffix() { return suffix; }


}
