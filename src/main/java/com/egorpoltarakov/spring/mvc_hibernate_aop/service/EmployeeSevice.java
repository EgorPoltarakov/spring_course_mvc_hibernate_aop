package com.egorpoltarakov.spring.mvc_hibernate_aop.service;

import com.egorpoltarakov.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeSevice {

    public List<Employee> getAllEmployees();
}
