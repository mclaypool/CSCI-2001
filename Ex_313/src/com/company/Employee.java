package com.company;

public class Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee() {
    }

    public Employee(String firstName, String lastName, double salary) {
        this.setFirstName( firstName );
        this.setLastName( lastName );
        this.setMonthlySalary( salary );
    }

    public void giveRaise(double percentDecimalRaise){
        double currentSalary = this.getMonthlySalary();
        double newSalary = currentSalary * ( 1 + percentDecimalRaise );
        this.setMonthlySalary( newSalary );
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

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void setMonthlySalary(double monthlySalary) {
        if ( monthlySalary < 0 ) {
            throw new IllegalArgumentException("Salary Cannot Be Negative");
        }
        this.monthlySalary = monthlySalary;
    }
}
