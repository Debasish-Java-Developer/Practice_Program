package com.Employee.entity;

import jakarta.persistence.*;   // use javax.persistence.* if you're on older Spring Boot

@Entity
@Table(name = "employees")    // MySQL table name
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT in MySQL
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name", nullable = false, length = 100)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 100)
    private String lastName;

    @Column(name = "email", nullable = false, unique = true, length = 150)
    private String email;

    // ===== Constructors =====

    // No-arg constructor (required by JPA)
    public Employees() {
    }

    // Convenience constructor
    public Employees(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName  = lastName;
        this.email     = email;
    }

    // Optionally full constructor with id (rarely needed)
    public Employees(Long id, String firstName, String lastName, String email) {
        this.id        = id;
        this.firstName = firstName;
        this.lastName  = lastName;
        this.email     = email;
    }

    // ===== Getters & Setters =====

    public Long getId() {
        return id;
    }

    public void setId(Long id) {      // usually not used for new entities, DB sets it
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // ===== toString (useful for logs) =====

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

