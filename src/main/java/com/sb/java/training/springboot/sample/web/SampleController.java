package com.sb.java.training.springboot.sample.web;

import com.sb.java.training.springboot.sample.model.Employee;
import com.sb.java.training.springboot.sample.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SampleController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/employees")
    public List<Employee> GetEmployees(){
        return employeeService.getEmployees();
    }
}
