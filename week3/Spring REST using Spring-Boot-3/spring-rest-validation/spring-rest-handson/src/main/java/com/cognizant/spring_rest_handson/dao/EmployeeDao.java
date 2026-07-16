package com.cognizant.spring_rest_handson.dao;

import com.cognizant.spring_rest_handson.exception.EmployeeNotFoundException;
import com.cognizant.spring_rest_handson.model.Department;
import com.cognizant.spring_rest_handson.model.Employee;
import com.cognizant.spring_rest_handson.model.Skill;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class EmployeeDao {

    private static final List<Employee> EMPLOYEE_LIST = new ArrayList<>();

    static {

        try {

            Department dept = new Department(1, "IT");

            Skill s1 = new Skill(1, "Java");
            Skill s2 = new Skill(2, "Spring Boot");

            Employee e1 = new Employee(
                    1,
                    "Rahul",
                    50000.0,
                    true,
                    new SimpleDateFormat("dd/MM/yyyy").parse("10/05/2000"),
                    dept,
                    Arrays.asList(s1, s2)
            );

            Employee e2 = new Employee(
                    2,
                    "Priya",
                    60000.0,
                    true,
                    new SimpleDateFormat("dd/MM/yyyy").parse("15/08/1999"),
                    dept,
                    Arrays.asList(s1)
            );

            EMPLOYEE_LIST.add(e1);
            EMPLOYEE_LIST.add(e2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Employee> getAllEmployees() {
        return EMPLOYEE_LIST;
    }

    public void updateEmployee(Employee employee)
            throws EmployeeNotFoundException {

        for (int i = 0; i < EMPLOYEE_LIST.size(); i++) {

            if (EMPLOYEE_LIST.get(i).getId().equals(employee.getId())) {

                EMPLOYEE_LIST.set(i, employee);
                return;
            }
        }

        throw new EmployeeNotFoundException("Employee Not Found");
    }

    public void deleteEmployee(Integer id)
            throws EmployeeNotFoundException {

        Employee emp = null;

        for (Employee e : EMPLOYEE_LIST) {

            if (e.getId().equals(id)) {
                emp = e;
                break;
            }
        }

        if (emp == null) {
            throw new EmployeeNotFoundException("Employee Not Found");
        }

        EMPLOYEE_LIST.remove(emp);
    }

}