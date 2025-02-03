package com.example.employee.model;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "employeelist")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employeeid")
    private int employeeId;

    @Column(name = "employeename")
    private String employeeName;

    @Column(name = "email")
    private String email;

    @Column(name = "department")
    private String department;

    public Employee() {
    }

    public Employee(int id, String name, String mail, String dept) {
        this.employeeId = id;
        this.employeeName = name;
        this.email = mail;
        this.department = dept;
    }

    public void setId(int id) {
        this.employeeId = id;
    }

    public void setName(String name) {
        this.employeeName = name;
    }

    public void setEmail(String mail) {
        this.email = mail;
    }

    public void setDepartment(String dept) {
        this.department = dept;
    }

    public int getId() {
        return this.employeeId;
    }

    public String getName() {
        return this.employeeName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getDepartment() {
        return this.department;
    }

}
