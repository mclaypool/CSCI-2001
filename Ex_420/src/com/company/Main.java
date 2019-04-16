package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        // declare vars used throughout app
        Scanner input = new Scanner( System.in );
        List<Employee> employees = new ArrayList<>();

        // loop and get employees
        for ( int i = 0; i < 3; i++ ) {
            out.println("Please enter an employee's first name");
            String firstName = input.next();

            out.println("Please enter an employee's last name");
            String lastName = input.next();

            out.println("Please enter the total hours the employee worked last week");
            double hoursWorked = input.nextDouble();

            out.println("Please enter the employee's hourly rate");
            double hourlyRate = input.nextDouble();

            Employee employee = new Employee(firstName, lastName,
                    hoursWorked, hourlyRate);

            employees.add(employee);

            // Print gross weekly pay
            out.printf("%s %s's Gross Pay: %f%n%n", firstName, lastName,
                    employee.calcGrossWeeklyPay());
        }

        // Print out summaries
        out.println( "\nLast Week's Employee Work Summary:" );

        for ( Employee employee : employees ) {
            out.println( employee.toString() );
        }
    }
}
