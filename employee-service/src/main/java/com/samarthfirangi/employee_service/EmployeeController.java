package com.samarthfirangi.employee_service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


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


}
