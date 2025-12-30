package com.Employee.service;

import com.Employee.payload.EmployeesDTO;

import com.Employee.entity.Employees;

import java.util.List;

public interface EmployeeService {

    // CREATE
    Employees createEmployee(EmployeesDTO request);

    // READ - by id
    Employees getEmployeeById(Long id);

    // READ - all
    List<Employees> getAllEmployees();

    // UPDATE
    Employees updateEmployee(Long id, EmployeesDTO request);

    // DELETE
    void deleteEmployee(Long id);
}

