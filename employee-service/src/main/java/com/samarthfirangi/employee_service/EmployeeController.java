package com.samarthfirangi.employee_service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final Employees employees;

    public EmployeeController(){
        this.employees = new Employees();

    }

     @GetMapping
    public Map<String, Object> getAllEmployees() {
        Map<String, Object> response = new HashMap<>();
        response.put("Employees", employees.getAllEmployees());
        return response;
    
    }
   
    
   @PostMapping
    public Map<String, String> addEmployee(@RequestBody Employee newEmployee) {
        employees.addEmployee(newEmployee);  // Add new employee to the list
        Map<String, String> response = new HashMap<>();
        response.put("message", "Employee added successfully");
        return response;
    }


}
