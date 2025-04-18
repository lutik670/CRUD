package com.rodionlukyanov.spring.mvc.controller;

import com.rodionlukyanov.spring.mvc.dao.EmployeeDAO;
import com.rodionlukyanov.spring.mvc.dao.EmployeeDAOImpl;
import com.rodionlukyanov.spring.mvc.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {


    @Autowired
    private EmployeeDAO employeeDAO;


    @RequestMapping("/")
    public String showAllEmployees(Model model){

        List<Employee> allEmployees = employeeDAO.getAllEmployees();
        model.addAttribute("allEmps", allEmployees);

        return "all-employees";
    }
}
