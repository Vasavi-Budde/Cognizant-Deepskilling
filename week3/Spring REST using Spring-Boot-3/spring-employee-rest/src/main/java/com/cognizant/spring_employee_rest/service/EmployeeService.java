package com.cognizant.spring_employee_rest.service;

import com.cognizant.spring_employee_rest.dao.EmployeeDao;
import com.cognizant.spring_employee_rest.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Transactional
    public ArrayList<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }
}