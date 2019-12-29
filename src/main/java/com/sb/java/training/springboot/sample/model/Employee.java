package com.sb.java.training.springboot.sample.model;

import lombok.Data;
import org.springframework.stereotype.Repository;

@Repository
@Data
public class Employee {
    private String name;
    private String address;
    private long salary;
}
