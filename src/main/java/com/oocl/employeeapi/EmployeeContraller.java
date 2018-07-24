package com.oocl.employeeapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class EmployeeContraller {

    @Autowired
    public EmployeeService employeeService;
    public Employee employee;

    @GetMapping("/employees")
    public ArrayList<Employee> getAllEmployees(){
        return employeeService.getList();
    }

    @PostMapping(path = "/employees/post")
    public ArrayList<Employee> postEmployee(@RequestBody Employee employee) {
        return employeeService.postEmployee(employee);
    }

    @DeleteMapping(path = "/employees/{id}")
    public  ArrayList<Employee> deleteEmployeeById(@PathVariable String id){
        return employeeService.deleteEmployeeById(id);
    }
}
