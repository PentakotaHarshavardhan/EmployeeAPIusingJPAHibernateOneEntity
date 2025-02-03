package com.example.employee.repository;

import java.util.*;
import com.example.employee.model.Employee;

public interface EmployeeRepository {
    ArrayList<Employee> getEmployees();

    Employee getEmployeeById(int id);

    Employee addEmployee(Employee emp);

    Employee updateEmployee(Employee emp, int id);

    void deleteById(int id);

}