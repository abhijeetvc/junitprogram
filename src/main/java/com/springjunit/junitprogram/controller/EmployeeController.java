package com.springjunit.junitprogram.controller;

import com.springjunit.junitprogram.model.Employee;
import com.springjunit.junitprogram.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping(value="/getallemp")
    public ResponseEntity<?> getEmployee(){
        ResponseEntity<?> entity=null;
        List<Employee> list=employeeRepository.findAll();
        Map<String,Object> map=new HashMap();
        map.put("status", HttpStatus.CREATED);
        map.put("result",list);
        map.put("message","Success");
        entity=ResponseEntity.ok(map);
        return entity;
    }
}
