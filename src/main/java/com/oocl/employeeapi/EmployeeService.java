package com.oocl.employeeapi;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmployeeService {
    private ArrayList<Employee> list = new ArrayList<>();

    public ArrayList<Employee> getList() {
        return list;
    }
    public void setList(ArrayList<Employee> list) {
        this.list = list;
    }

    public ArrayList<Employee> getAllEmployeeList(){
        Employee employee1 = new Employee("0","小明","20","男");
        list.add(employee1);
        return getList();
    }

    public ArrayList<Employee> postEmployee(Employee employee) {
        Employee newEmployee = new Employee(employee.getId(),
                employee.getName(),
                employee.getAge(),
                employee.getGender());
        list.add(newEmployee);
        return getList();
    }
}
