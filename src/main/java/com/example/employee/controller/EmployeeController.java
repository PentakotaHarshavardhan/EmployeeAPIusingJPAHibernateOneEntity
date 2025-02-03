package com.example.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeJpaService;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeJpaService service;

    @GetMapping("/employees")
    public ArrayList<Employee> getEmployees() {
        return service.getEmployees();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployeeById(@PathVariable("employeeId") int id) {
        return service.getEmployeeById(id);
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee emp) {
        return service.addEmployee(emp);
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@RequestBody Employee emp, @PathVariable("id") int id) {
        return service.updateEmployee(emp, id);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteById(@PathVariable("id") int id) {
        service.deleteById(id);
    }

}
