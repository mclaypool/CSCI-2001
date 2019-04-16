package com.company;

public class Employee {

    // Members ----------------------------------------------------------------
    private String firstName;
    private String lastName;
    private double hoursWorked;
    private double hourlyRate;

    // Constructors ------------------------------------------------------------
    public Employee(String firstName, String lastName,
                    double hoursWorked, double hourlyRate) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Methods -----------------------------------------------------------------
    public double getRegularTime() {
        if ( hoursWorked > 40 ) {
            return 40;
        }
        return hoursWorked;
    }

    public double getOvertime() {
        if ( hoursWorked > 40 ) {
            return hoursWorked - 40;
        }
        return 0;
    }

    public double getOvertimeRate() {
        return hourlyRate * 1.5;
    }

    public double calcGrossWeeklyPay() {
        double regular =  getRegularTime() * hourlyRate;
        double overtime = getOvertime() * getOvertimeRate();

        return regular + overtime;
    }

    @Override
    public String toString() {
        // Convert employee to JSON
        return "{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hoursWorked=" + hoursWorked +
                ", regularHours=" + getRegularTime() +
                ", Overtime=" + getOvertime() +
                ", hourlyRate=" + hourlyRate +
                ", overtimeRate=" + getOvertimeRate() +
                ", grossWeeklyPay=" + calcGrossWeeklyPay() +
                '}';
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

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
