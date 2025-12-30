package com.Employee.controller;


import com.Employee.entity.Employees;
import com.Employee.payload.EmployeesDTO;
import com.Employee.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    // Constructor injection
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // CREATE
    @PostMapping
    public ResponseEntity<Employees> createEmployee(@RequestBody EmployeesDTO request) {
        Employees savedEmployee = employeeService.createEmployee(request);
        return ResponseEntity.ok(savedEmployee);
    }

    // READ - get by id
    @GetMapping("/{id}")
    public ResponseEntity<Employees> getEmployeeById(@PathVariable Long id) {
        Employees employee = employeeService.getEmployeeById(id);
        return ResponseEntity.ok(employee);
    }

    // READ - get all
    @GetMapping
    public ResponseEntity<List<Employees>> getAllEmployees() {
        List<Employees> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<Employees> updateEmployee(@PathVariable Long id,
                                                    @RequestBody EmployeesDTO request) {
        Employees updatedEmployee = employeeService.updateEmployee(id, request);
        return ResponseEntity.ok(updatedEmployee);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.noContent().build(); // 204 No Content
    }
}
