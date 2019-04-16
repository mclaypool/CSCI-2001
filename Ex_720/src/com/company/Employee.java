package com.company;

public class Employee {
    // Members -----------------------------------------------------------------
    private String firstName;
    private String lastName;

    // Constructors ------------------------------------------------------------
    public Employee() { };

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Methods -----------------------------------------------------------------
    @Override
    public String toString() {
        // Convert employee to JSON
        return String.format(
                "{firstName='%s', lastName='%s'}", firstName, lastName
        );
    }

    // Standard Setters and Getters Methods-------------------------------------
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

    public String getFullName() {
        return this.firstName + " " + this.lastName.substring(0) + ".";
    }
}