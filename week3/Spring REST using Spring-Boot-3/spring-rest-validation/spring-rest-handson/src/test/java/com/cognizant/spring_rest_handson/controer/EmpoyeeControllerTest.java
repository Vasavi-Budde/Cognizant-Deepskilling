package com.cognizant.spring_rest_handson.controller;

import com.cognizant.spring_rest_handson.exception.EmployeeNotFoundException;
import com.cognizant.spring_rest_handson.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EmployeeService employeeService;

    @Test
    public void testUpdateEmployeeNotFound() throws Exception {

        Mockito.doThrow(new EmployeeNotFoundException("Employee Not Found"))
                .when(employeeService)
                .updateEmployee(any());

        String json = """
                {
                    "id":100,
                    "name":"Rahul",
                    "salary":50000,
                    "permanent":true
                }
                """;

        mockMvc.perform(put("/employees")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andExpect(status().isNotFound());
    }
}