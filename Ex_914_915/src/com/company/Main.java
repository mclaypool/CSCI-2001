package com.company;

public class Main {

    public static void main(String[] args) {
        // The majority of tests for this project have been converted to unit tests
        // Please see each class's test functions for their specific tests.

        // I have this main method here to test that the toStrings console print correctly

        Employee employee = new Employee( "Sue", "Jones", "222-22-2222" );
        System.out.printf( "%s%n", employee );

        CommissionEmployee commissionEmployee = new CommissionEmployee(
                "Sue", "Jones", "222-22-2222", 5000, .1 );
        System.out.printf( "%n%s%n", commissionEmployee );

        BasePlusCommissionEmployee baseCommEmployee = new BasePlusCommissionEmployee(
                "Bob", "Lewis", "333-33-3333", 5000, .04, 1000 );
        System.out.printf( "%n%s%n", baseCommEmployee );

        HourlyEmployee hourlyEmployee = new HourlyEmployee(
                "Sue", "Jones", "222-22-2222", 20, 40 );
        System.out.printf( "%n%s%n", hourlyEmployee );
    }
}