package com.Employee.service.Impl;


import com.Employee.entity.Employees;
import com.Employee.exception.ResourceNotFoundException;
import com.Employee.payload.EmployeesDTO;
import com.Employee.repository.EmployeeRepository;
import com.Employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // ============ CREATE ============

    @Override
    public Employees createEmployee(EmployeesDTO request) {

        // 1) Create new entity
        Employees employee = new Employees();

        // 2) Manual mapping: DTO -> Entity (minimal fields we defined)
        employee.setFirstName(request.getFirstName());
        employee.setLastName(request.getLastName());
        employee.setEmail(request.getEmail());

        // 3) Save to DB
        return employeeRepository.save(employee);
    }

    // ============ READ (by id) ============

    @Override
    public Employees getEmployeeById(Long id) {

        return employeeRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Employee not found with id: " + id));
    }

    // ============ READ (all) ============

    @Override
    public List<Employees> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // ============ UPDATE ============

    @Override
    public Employees updateEmployee(Long id, EmployeesDTO request) {

        // 1) Find existing entity
        Employees existing = employeeRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Employee not found with id: " + id));

        // 2) Manual mapping: copy fields from DTO to existing entity
        existing.setFirstName(request.getFirstName());
        existing.setLastName(request.getLastName());
        existing.setEmail(request.getEmail());

        // 3) Save updated entity
        return employeeRepository.save(existing);
    }

    // ============ DELETE ============

    @Override
    public void deleteEmployee(Long id) {

        Employees existing = employeeRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Employee not found with id: " + id));

        employeeRepository.delete(existing);
    }
}
