package com.oocl.employeeapi;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmployeeService {

    public ArrayList<Employee> list = new ArrayList<>();
    {
        Employee employee1 = new Employee("0","小明","20","男");
        Employee employee2 = new Employee("1","小明","20","男");
        list.add(employee1);
        list.add(employee2);
    }
    public ArrayList<Employee> getList() {
        return list;
    }

    public ArrayList<Employee> postEmployee(Employee employee) {
        Employee newEmployee = new Employee(employee.getId(),
                employee.getName(),
                employee.getAge(),
                employee.getGender());
        list.add(newEmployee);
        return list;
    }

    public ArrayList<Employee> deleteEmployeeById(String id) {
        for(Employee e:list){
            if(e.getId().equals(id)){
                list.remove(e);
            }
        }
        return list;
    }

    public ArrayList<Employee> updateEmployeeById(Employee employee) {
        for(Employee e:list){
            if(e.getId().equals(employee.getId())){
                e.setName(employee.getName());
                e.setAge(employee.getAge());
                e.setGender(employee.getGender());
            }
        }
        return list;
    }

    public Employee findEmployeeById(String id) {
        Employee find = new Employee();
        for(Employee employee:list){
            if(employee.getId().equals(id)){
                find = employee;
            }
        }
        return find;
    }
}
