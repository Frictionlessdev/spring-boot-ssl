package com.sb.java.training.springboot.sample.service;

import com.sb.java.training.springboot.sample.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    public List<Employee> getEmployees(){
        List<Employee> employees = new ArrayList();
        Employee e1 = new Employee();
        e1.setName("Shivi");
        e1.setAddress("Gurgaon");
        employees.add(e1);

        return employees;
    }
}
