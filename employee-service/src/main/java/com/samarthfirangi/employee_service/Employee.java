package com.samarthfirangi.employee_service;

public class Employee {

    private String employee_id;
    private String first_name;
    private String last_name;
    private String title;
    private String email;

    public Employee(String employee_id, String first_name, String last_name, String title, String email) {
        this.employee_id = employee_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.title = title;
        this.email = email;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}

   