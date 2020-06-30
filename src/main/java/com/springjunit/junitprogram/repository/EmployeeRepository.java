package com.springjunit.junitprogram.repository;

import com.springjunit.junitprogram.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
