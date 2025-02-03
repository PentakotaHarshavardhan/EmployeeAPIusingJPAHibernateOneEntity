package com.example.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.*;
import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRepository;
import com.example.employee.repository.EmployeeJpaRepository;

@Service
public class EmployeeJpaService implements EmployeeRepository {
    @Autowired
    private EmployeeJpaRepository db;

    @Override
    public ArrayList<Employee> getEmployees() {
        List<Employee> list = db.findAll();
        ArrayList<Employee> arrList = new ArrayList<>(list);
        return arrList;
    }

    @Override
    public Employee getEmployeeById(int id) {
        try {
            Employee emp = db.findById(id).get();
            return emp;
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }

    @Override

    public Employee addEmployee(Employee emp) {
        return db.save(emp);
    }

    @Override
    public Employee updateEmployee(Employee emp, int id) {
        try {
            Employee newEmp = db.findById(id).get();
            if (newEmp.getName() != null) {
                newEmp.setName(newEmp.getName());
            }
            if (newEmp.getEmail() != null) {
                newEmp.setName(newEmp.getEmail());
            }
            if (newEmp.getDepartment() != null) {
                newEmp.setDepartment(newEmp.getDepartment());
            }
            return db.save(newEmp);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }

    @Override
    public void deleteById(int id) {
        try {
            db.deleteById(id);
        } catch (Exception e) {

            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

}
