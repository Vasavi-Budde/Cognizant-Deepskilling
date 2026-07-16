package com.cognizant.spring_employee_rest.service;

import com.cognizant.spring_employee_rest.dao.DepartmentDao;
import com.cognizant.spring_employee_rest.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentDao departmentDao;

    public ArrayList<Department> getAllDepartments() {
        return departmentDao.getAllDepartments();
    }
}