package com.cognizant.spring_rest_handson.service;

import com.cognizant.spring_rest_handson.dao.EmployeeDao;
import com.cognizant.spring_rest_handson.exception.EmployeeNotFoundException;
import com.cognizant.spring_rest_handson.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public List<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }

    public void updateEmployee(Employee employee)
            throws EmployeeNotFoundException {

        employeeDao.updateEmployee(employee);
    }

    public void deleteEmployee(Integer id)
            throws EmployeeNotFoundException {

        employeeDao.deleteEmployee(id);
    }

}