package com.oocl.employeeapi;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmployeeService {

    public ArrayList<Employee> getAllEmployeeList(){
        ArrayList<Employee> list = new ArrayList<>();
        Employee employee1 = new Employee("0","小明","20","男");
        Employee employee2 = new Employee("1","小红","19","女");
        Employee employee3 = new Employee("2","小智","15","男");
        Employee employee4 = new Employee("3","小刚","16","男");
        Employee employee5 = new Employee("4","小霞","15","女");
        list.add(employee1);list.add(employee2);list.add(employee3);
        list.add(employee4);list.add(employee5);
        return list;
    }

}
