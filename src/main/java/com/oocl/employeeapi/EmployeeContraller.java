package com.oocl.employeeapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class EmployeeContraller {

    @Autowired
    public EmployeeService employeeService;
    public Employee employee;

    @GetMapping("/employees")
    public ArrayList<Employee> getAllEmployees(){
        return employeeService.getAllEmployeeList();
    }

    @PostMapping(path = "/employees/post")
    public ArrayList<Employee> postEmployee(@RequestBody Employee employee) {
        return employeeService.postEmployee(employee);
    }
    
}
