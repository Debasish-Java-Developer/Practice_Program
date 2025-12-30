package com.Employee.payload;


public class EmployeesDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;

    // ===== Constructors =====

    public EmployeesDTO() {
    }

    public EmployeesDTO(Long id, String firstName, String lastName, String email) {
        this.id        = id;
        this.firstName = firstName;
        this.lastName  = lastName;
        this.email     = email;
    }

    // add a constructor without id
    public EmployeesDTO(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName  = lastName;
        this.email     = email;
    }

    // ===== Getters & Setters =====

    public Long getId() {
        return id;
    }

    public void setId(Long id) {      // usually used when sending data back to client
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

    // ===== toString (optional but useful) =====

    @Override
    public String toString() {
        return "EmployeesDTO{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
