package com.samarthfirangi.employee_service;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<Employee> employeeList;

    public Employees(){
        employeeList = new ArrayList<>();

        employeeList.add(new Employee("101", "John", "Doe", "john.doe@example.com", "Software Engineer"));
        employeeList.add(new Employee("102", "Jane", "Smith", "jane.smith@example.com", "Product Manager"));
        employeeList.add(new Employee("103", "Samarth", "Firangi", "samarth@example.com", "DevOps Engineer"));
    }

    public List<Employee> getAllEmployees(){
        return employeeList;
    }

    public void addEmployee(Employee employee){
        this.employeeList.add(employee);
    }
    

}
