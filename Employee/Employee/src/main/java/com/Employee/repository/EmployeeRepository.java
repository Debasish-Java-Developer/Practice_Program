package com.Employee.repository;


import com.Employee.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employees, Long> {

    // you can add custom query methods later, e.g.:
    // Employees findByEmail(String email);
}
