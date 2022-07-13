package com.egorpoltarakov.spring.mvc_hibernate_aop.service;

import com.egorpoltarakov.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeSevice{
    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }
}
