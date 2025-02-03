package com.example.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;
import com.example.employee.model.Employee;

@Repository
public interface EmployeeJpaRepository extends JpaRepository<Employee, Integer> {

}