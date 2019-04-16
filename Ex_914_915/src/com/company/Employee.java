package com.company;

public class Employee {

    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    // Constructors ------------------------------------------------------------
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // Methods -----------------------------------------------------------------
    @Override
    public String toString() {
        return String.format(
                "%s: %s %s%n%s: %s",
                "employee", firstName, lastName,
                "social security number", socialSecurityNumber
        );
    }

    // Setter and Getters ------------------------------------------------------
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
}
