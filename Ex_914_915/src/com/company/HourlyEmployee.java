package com.company;

public class HourlyEmployee extends Employee {

    private double wage;
    private double hours; // total weekly hours

    // Constructors ------------------------------------------------------------
    public HourlyEmployee(String firstName, String lastName,
                          String socialSecurityNumber,
                          double wage, double hours
    ) {
        super(firstName, lastName, socialSecurityNumber);
        setWage( wage );
        setHours( hours );
    }

    // Methods -----------------------------------------------------------------
    public double earnings() {
        return wage * hours;
    }

    @Override
    public String toString() {
        String output = super.toString();
        output = output.replaceAll("employee:", "hourly employee:");

        return String.format(
                "%s%n%s: %.2f%n%s: %.2f",
                output,
                "hourly wage", wage,
                "hours worked", hours
        );
    }

    // Setter and Getters ------------------------------------------------------
    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if ( wage < 0.0 ) {
            throw new IllegalArgumentException("Wage must be >= 0.0");
        }

        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if ( hours < 0.0 || hours > 168 ) {
            throw new IllegalArgumentException(
                    "Hours must be >= 0.0 and =< 168");
        }

        this.hours = hours;
    }
}
