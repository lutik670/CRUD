package com.rodionlukyanov.spring.mvc.dao;

import com.rodionlukyanov.spring.mvc.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
}
